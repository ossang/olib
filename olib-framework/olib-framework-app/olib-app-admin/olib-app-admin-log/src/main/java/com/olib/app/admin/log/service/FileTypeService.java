package com.olib.app.admin.log.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olib.app.admin.log.AdminLogStarter;
import com.olib.app.admin.log.model.browser.CustomFilterSearch;
import com.olib.app.admin.log.model.browser.FileContent;
import com.olib.app.admin.log.model.browser.FileType;

@Service
public class FileTypeService implements InitializingBean{
	
	private int pagePerCount;
	private String[] extList;
	private String defaultPath;
	
	@Autowired
	private AdminLogStarter starter;
	
//------------------------------------------------------------------------------
	public FileTypeService(){}
	
	public void afterPropertiesSet() throws Exception {
		initialize();
	}
	
//------------------------------------------------------------------------------
	private void initialize(){
		this.pagePerCount = Integer.parseInt(starter.getProperties().getProperty("admin.log.browser.pagePerCount"));
		if(pagePerCount == 0){
			this.pagePerCount = 1000;
		}
		
		String ext = starter.getProperties().getProperty("admin.log.browser.extList");
		if(ext != null){
			this.extList = ext.split(",");
		}
		this.defaultPath = starter.getProperties().getProperty("admin.log.browser.defaultPath");
		
	}
	
//------------------------------------------------------------------------------
	public long getFileLineCount(File file){
		Path path = Paths.get(file.getAbsolutePath());
	    try(Stream<String> lines = Files.lines(path)){
	    	return lines.count();
	    } catch (IOException e) {
	    	e.printStackTrace();
		}
	    return 0;
	}
	
	// 파일타입으로 반환
	public FileType getFileType(File file){
		if(!isValidFile(file)) return null;
		
		FileType fileType = new FileType();
		fileType.setFileName(file.getName());
		fileType.setFilePath(file.getAbsolutePath());
		fileType.setFileDate(getReadableFileDate(file.lastModified()));
		if(file.isFile()){
			fileType.setFileSize(getReadableFileSize(file.length()));
			fileType.setFileType(FileType.TYPE_FILE);
			
		}else if(file.isDirectory()){
			fileType.setFileSize("");
			fileType.setFileType(FileType.TYPE_DIR);
			fileType.setFileLineCount(0);
		}
		
		return fileType; 
	}
	
	// currentPage : 1 페이지 부터 시작
	public FileContent getFileContent(String path, int currentPage) {
		File file = new File(path);
		if(!isValidFile(file)) return null;

		if(file.isFile()){
			long totalLineCount = getFileLineCount(file);

			FileContent fileContent = new FileContent();
			fileContent.setFileLineCount(totalLineCount);
			fileContent.setFileName(file.getName());
			fileContent.setFilePath(file.getAbsolutePath());
			fileContent.setFileSize(getReadableFileSize(file.length()));
			fileContent.setPagePerCount(this.pagePerCount);
			fileContent.setFileDate(getReadableFileDate(file.lastModified()));
			
			fileContent.setFileBody(getFileBody(file.getAbsolutePath(), currentPage).getFileBody());
			fileContent.setCurrentPage(currentPage);
			fileContent.setTotalPageCount(getTotalPageCount(totalLineCount));
			
			return fileContent;
			
		}
		return null;
	}
	
	public FileContent getFileContent(String filePath) {
		File file = new File(filePath);
		if(!isValidFile(file)) return null;
		
		if(file.isFile()){
			FileContent fileContent = new FileContent();
			long totalLineCount = getFileLineCount(file);
			fileContent.setFileLineCount(totalLineCount);
			fileContent.setFileName(file.getName());
			fileContent.setFilePath(file.getAbsolutePath());
			fileContent.setFileSize(getReadableFileSize(file.length()));
			fileContent.setPagePerCount(this.pagePerCount);
			fileContent.setFileDate(getReadableFileDate(file.lastModified()));
			fileContent.setTotalPageCount(getTotalPageCount(totalLineCount));
			return fileContent;
			
		}
		return null;
	}
	
	public int getTotalPageCount(long totalLineCount){
		int totalPageCount = (int) (totalLineCount / this.pagePerCount); 
		return (totalPageCount < 1 )? 1:totalPageCount+1 ;
	}
	
	public List<FileType> getFileTypeList(String path) {
		ArrayList<FileType> fileTypeList = new ArrayList<FileType>();
		FileType fileType = null;
		File file = new File(path);

		if(!isValidFile(file)) return null;
		
		if(file.isDirectory()){
			File[] fileList = file.listFiles();
			
			if(fileList != null){
				for(File subFile : fileList){
					if(subFile != null){
						if(subFile.isDirectory()){
							fileType = getFileType(subFile);
							fileTypeList.add(fileType);
							
						}else if(subFile.isFile()){
							if(!isValidExtFile(subFile, extList)) continue;
							fileType = getFileType(subFile);
							fileTypeList.add(fileType);
						}
					}
				}
			}
			
		}else if(file.isFile()){
			if(!isValidExtFile(file, extList)) return null;
			
			fileType = getFileType(file);
			if(fileType != null){
				fileTypeList.add(fileType);
			}
		}
		
		if(fileTypeList.size() > 0){
			ArrayList<FileType> dirList = new ArrayList<FileType>();
			ArrayList<FileType> fileList = new ArrayList<FileType>();
			
			for(FileType ft : fileTypeList){
				if(ft.getFileType().equals(FileType.TYPE_DIR)){
					dirList.add(ft);
				}else{
					fileList.add(ft);
				}
			}
			dirList.sort((s1,s2) -> s1.getFileName().compareTo(s2.getFileName()));
			fileList.sort((s1,s2) -> s1.getFileName().compareTo(s2.getFileName()));
			dirList.addAll(fileList);
			return dirList;
		}else{
			return null;
		}
	}
	
	// 파일의 start 라인부터 end 라인까지 반환
	public FileContent getFileBody(String filePath, int currentPage){
		StringBuffer sb = new StringBuffer();
		FileContent fileContent = getFileContent(filePath);
		
	    Path path = Paths.get(filePath);
	    int start = this.pagePerCount * (currentPage-1);
		int end = this.pagePerCount * (currentPage);
		
	    try(Stream<String> filteredLines = Files.lines(path)){
	    	Iterator<String> iterator = filteredLines.iterator();
	    	int lineCount =0;
	    	
	    	while(iterator.hasNext()){
	    		lineCount++;
	    		if(lineCount < start) {iterator.next(); continue;}
				
				if(lineCount >= start && lineCount <=end){
					sb.append(iterator.next()).append("<br/>");
				}
				if(lineCount > end){
					break;
				}
	    	}
	    	fileContent.setFileBody(sb.toString());
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    return fileContent;
	}
	
	// kewyord 가 있는 파일 라인만 리턴
	public FileContent getFileBodySearch(String filePath, String keyword,int currentPage){
		StringBuffer sb = new StringBuffer();
		FileContent fileContent = getFileContent(filePath);
		
	    Path path = Paths.get(filePath);
	    int start = this.pagePerCount * (currentPage-1);
		int end = this.pagePerCount * (currentPage);
		
	    try(Stream<String> filteredLines = Files.lines(path).filter(s->s.contains(keyword))){
	    	Iterator<String> iterator = filteredLines.iterator();
	    	int lineCount =0;
	    	
	    	while(iterator.hasNext()){
	    		lineCount++;
	    		if(lineCount < start) {iterator.next(); continue;}
				
				if(lineCount >= start && lineCount <=end){
					sb.append(iterator.next()).append("<br/>");
				}
				if(lineCount > end){
					break;
				}
	    	}
	    	fileContent.setTotalPageCount(getTotalPageCount(Files.lines(path).filter(s->s.contains(keyword)).count()));
	    	fileContent.setFileBody(sb.toString());
	    } catch (IOException e) {
			e.printStackTrace();
		}
	    return fileContent;
	}
	
	public FileContent getFileBodySearchPage(String filePath, String keyword, int currentPage) {
		FileContent fileContent = getFileBodySearch(filePath, keyword,currentPage);
		String[] fileLineArr = fileContent.getFileBody().split("<br/>");
		StringBuffer sb = new StringBuffer();
		
		int start = this.pagePerCount * (currentPage-1);
		int end = this.pagePerCount * (currentPage);
		int lineCount = 0;
		
		for(String fileLine : fileLineArr)	{
			lineCount++;
			
			if(lineCount < start) continue;
			
			if(lineCount >= start && lineCount <=end){
				sb.append(fileLine).append("<br/>");
			}
			if(lineCount > end){
				break;
			}
		}
		fileContent.setFileBody(sb.toString());
		return fileContent;
	}
	
	// 파일의 확장자 반환
	public String getFileExt(File file){
		if(!isValidFile(file)) return null;
		
		String fileName = file.getName();
		if(fileName.length() < 3) return null;
		
		return fileName.substring(fileName.length()-3, fileName.length());
	}
	
	// 파일의 확장자가 extList 에 포함되어있으면 true 리턴
	public boolean isValidExtFile(File file, String[] extList){
		if(file == null || !file.exists() || extList == null) return false;
		
		if("all".equalsIgnoreCase(extList[0])){
			return true;
		}
		
		String fileExt = getFileExt(file);
		for(String ext : extList){
			if(ext.equals(fileExt)){
				return true;
			}
		}
		
		return false;
	}
	
	// 파일 예외처리
	public boolean isValidFile(File file){
		if(file == null) return false;
		if(!file.exists()) return false;
		if(!file.canRead()) return false;
		
		return true;
	}
	
	public boolean isImgFile(File file){
		String ext = getFileExt(file);
		
		if("jpg".equalsIgnoreCase(ext)
			||"png".equalsIgnoreCase(ext)
			||"gif".equalsIgnoreCase(ext)
			||"bmp".equalsIgnoreCase(ext)
			||"jpe".equalsIgnoreCase(ext)
			){
			
			return true;
		}
		
		return false;
	}
	
	public String getReadableFileDate(long lastModified){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(lastModified));
	}
	
	public String getReadableFileSize(long size) {
		if(size <= 0) return "0";
		final String[] units = new String[] { "B", "kB", "MB", "GB", "TB" };
		int digitGroups = (int) (Math.log10(size)/Math.log10(1024));
		return new DecimalFormat("#,##0.#").format(size/Math.pow(1024, digitGroups)) + " " + units[digitGroups];
	}

	public String getDefaultPath() {
		return defaultPath;
	}

	public FileContent customFilterSearch(CustomFilterSearch search) {
		FileContent content = getFileBodySearch(
				search.getPath(),
				search.getKeyword(),
				search.getCurrentPage());
		
		StringBuffer sb = new StringBuffer();
		String[] lines = content.getFileBody().split("<br/>");
		
		if(search.getDateFormat() != null){
			Pattern datePattern = Pattern.compile(dateFormatToRegEx(search.getDateFormat()));
			
			for(String line : lines){
				Matcher matcher = datePattern.matcher(line);
				
				if(matcher.find()){
					String dateString = matcher.group();
					
					if(isValidDate(dateString, search.getDateStart(), search.getDateEnd())){
						sb.append(filterString(line, search.getReplaceMap()));
						sb.append("<br/>");
					}
				}
				
			}
		}else{
			for(String line : lines){
				sb.append(filterString(line, search.getReplaceMap()));
				sb.append("<br/>");
			}
		}
		
		content.setFileBody(sb.toString());
		return content;
	}
	
	// 다음값에 의해서 바뀔 가능성있어서 체크가 필요
	private String filterString(String target, Map<String, String> filterMap){
		if(filterMap == null || filterMap.size() == 0) {
			return target;
		}
		String tempTarget = new String(target);
		for(String key : filterMap.keySet()){
			tempTarget = tempTarget.replace(key, filterMap.get(key));
		}
		
		return tempTarget;
	}
	
	private boolean isValidDate(
			String target, 
			String startDate, 
			String endDate){
		
		if(startDate == null || endDate == null){
			return true;
		}
		
		Pattern pattern = Pattern.compile("\\d");
		
		Matcher targetMatchar = pattern.matcher(target);
		StringBuffer targetSb = new StringBuffer();
		while(targetMatchar.find()){
			targetSb.append(targetMatchar.group());
		}
		Matcher startMatchar = pattern.matcher(startDate);
		StringBuffer startSb = new StringBuffer();
		while(startMatchar.find()){
			startSb.append(startMatchar.group());
		}
		Matcher endMatchar = pattern.matcher(endDate);
		StringBuffer endSb = new StringBuffer();
		while(endMatchar.find()){
			endSb.append(endMatchar.group());
		}
		
		long targetData = Long.parseLong(targetSb.toString());
		long startData = Long.parseLong(startSb.toString());
		long endData = Long.parseLong(endSb.toString());
		
		if(targetData >= startData && targetData <= endData){
			return true;
		}
		
		return false;
	}
	// yyyy-MM-dd HH:mm:ss -> \d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}
	public String dateFormatToRegEx(String dateFormat){
		String[] formatStr = {"y","m","d","h","s"};
		ArrayList<String> formatList = new ArrayList<>();
		Collections.addAll(formatList, formatStr);
		StringBuffer regEx = new StringBuffer();
		int formatCount=0;
		
		for(int i = 0; i< dateFormat.length(); i++){
			if(formatList.contains(dateFormat.toLowerCase().charAt(i)+"")){
				formatCount++;
			}else{
				regEx.append("\\d").append("{").append(formatCount).append("}");
				regEx.append(dateFormat.charAt(i));
				formatCount = 0;
			}
		}
		
		if(formatCount > 0){
			regEx.append("\\d").append("{").append(formatCount).append("}");
		}
		
		return regEx.toString();
	}
}
