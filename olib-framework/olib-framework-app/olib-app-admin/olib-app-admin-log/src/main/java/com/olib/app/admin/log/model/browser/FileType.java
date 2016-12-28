package com.olib.app.admin.log.model.browser;


public class FileType {

	public static final String TYPE_FILE="TYPE_FILE";
	public static final String TYPE_DIR="TYPE_DIR";
	public static final String TYPE_IMG="TYPE_IMG";
	
//------------------------------------------------------------------------------	
	private String fileName;
	private String fileSize;
	private String fileType;
	private String filePath;
	private String fileDate;
	private int fileLineCount;
	private int totalPageCount;
	

//------------------------------------------------------------------------------
	public FileType(){}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getFileSize() {
		return fileSize;
	}


	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}


	public String getFileType() {
		return fileType;
	}


	public void setFileType(String fileType) {
		this.fileType = fileType;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public String getFileDate() {
		return fileDate;
	}


	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}


	public int getFileLineCount() {
		return fileLineCount;
	}


	public void setFileLineCount(int fileLineCount) {
		this.fileLineCount = fileLineCount;
	}


	public int getTotalPageCount() {
		return totalPageCount;
	}


	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}


	public static String getTypeFile() {
		return TYPE_FILE;
	}


	public static String getTypeDir() {
		return TYPE_DIR;
	}


	public static String getTypeImg() {
		return TYPE_IMG;
	}
	
//------------------------------------------------------------------------------
	
}
