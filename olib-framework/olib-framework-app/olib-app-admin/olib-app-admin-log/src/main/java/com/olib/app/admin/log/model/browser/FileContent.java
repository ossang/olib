package com.olib.app.admin.log.model.browser;

import java.io.File;

public class FileContent {

	private String filePath;
	private String fileName;
	private String fileBody;
	private String fileSize;
	private String fileDate;
	private long fileLineCount;
	private int currentPage;
	private int totalPageCount;
	private int pagePerCount;
	
//------------------------------------------------------------------------------	
	public FileContent(){}
	public FileContent(String fileBody){
		this.fileBody = fileBody;
	}
	public FileContent(String fileBody, long fileLineCount, int totalPageCount){
		this.fileBody = fileBody;
		this.fileLineCount = fileLineCount;
		this.totalPageCount = totalPageCount;
	}
	public FileContent(File file){
		this.fileName = file.getName();
		this.filePath = file.getAbsolutePath();
	}
	
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileBody() {
		return fileBody;
	}
	public void setFileBody(String fileBody) {
		this.fileBody = fileBody;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileDate() {
		return fileDate;
	}
	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}
	public long getFileLineCount() {
		return fileLineCount;
	}
	public void setFileLineCount(long fileLineCount) {
		this.fileLineCount = fileLineCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPagePerCount() {
		return pagePerCount;
	}
	public void setPagePerCount(int pagePerCount) {
		this.pagePerCount = pagePerCount;
	}
	
//------------------------------------------------------------------------------	
}
