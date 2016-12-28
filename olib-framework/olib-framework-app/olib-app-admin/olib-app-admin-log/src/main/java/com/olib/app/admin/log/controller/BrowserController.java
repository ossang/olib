package com.olib.app.admin.log.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olib.app.admin.log.model.browser.CustomFilterSearch;
import com.olib.app.admin.log.model.browser.FileContent;
import com.olib.app.admin.log.model.browser.FileType;
import com.olib.app.admin.log.service.FileTypeService;

@Controller
@RequestMapping(value="/log/browser")
public class BrowserController {

	@Autowired
	private FileTypeService fileTypeService;
	
	@RequestMapping(value="/")
	public String browser(){
		return "/browser/browser_main";
	}
	
//------------------------------------------------------------------------------
	@ResponseBody
	@RequestMapping(value="/fileTypeList", method=RequestMethod.GET)
	public List<FileType> getFileTypeList(
			@RequestParam(value="path") String path
			){
		
		return fileTypeService.getFileTypeList(path);
	}
	
	@ResponseBody
	@RequestMapping(value="/fileContent",method=RequestMethod.GET)
	public FileContent getFileContent(
			@RequestParam(value="path") String path,
			@RequestParam(value="currentPage") int currentPage
			){
		
		return fileTypeService.getFileContent(path,currentPage);
	}
	
	@ResponseBody
	@RequestMapping(value="/fileBody",method=RequestMethod.GET)
	public FileContent getFileBody(
			@RequestParam(value="path") String path,
			@RequestParam(value="currentPage") int currentPage
			
			){
		
		return fileTypeService.getFileBody(path, currentPage);
	}
	
	@ResponseBody
	@RequestMapping(value="/fileBodySearch",method=RequestMethod.GET)
	public FileContent getFileBodySearch(
			@RequestParam(value="path") String path,
			@RequestParam(value="keyword") String keyword,
			@RequestParam(value="currentPage") int currentPage
			
			){
		
		return fileTypeService.getFileBodySearch(path, keyword,currentPage);
	}
	
	@ResponseBody
	@RequestMapping(value="/customFilterSearch",method=RequestMethod.POST)
	public FileContent customFilterSearch(
			@RequestBody CustomFilterSearch search){
		
		return fileTypeService.customFilterSearch(search);
	}
	
	
	
}
