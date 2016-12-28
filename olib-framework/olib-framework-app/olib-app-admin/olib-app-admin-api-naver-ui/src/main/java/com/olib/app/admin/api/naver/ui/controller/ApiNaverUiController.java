package com.olib.app.admin.api.naver.ui.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olib.app.admin.api.naver.ui.domain.ClassInfo;
import com.olib.app.admin.api.naver.ui.service.ApiNaverUiService;
import com.olib.core.util.OlibExceptionUtil;

@Controller
@RequestMapping(value="/api/naver")
public class ApiNaverUiController{
	
	@Autowired
	private ApiNaverUiService service;
	
//------------------------------------------------------------------------------	
	@RequestMapping(value="/main")
	public String main(Model model){
		return "/apinaverui/apinaverui_main";
	}
	
	@ResponseBody
	@RequestMapping(value="/getServiceList")
	public List<ClassInfo> getServiceList(){
		return service.getServiceList();
	}
	
	@ResponseBody
	@RequestMapping(value="/run",method=RequestMethod.POST)
	public Object run(
			@RequestBody String jsonData){
		
		try {
			Object result = service.executeMethod(jsonData);
			return Arrays.asList(result);
		} catch (Exception e) {
			e.printStackTrace();
			return Arrays.asList(OlibExceptionUtil.stackTraceToStringAll(e));
		}
	}
}
	
