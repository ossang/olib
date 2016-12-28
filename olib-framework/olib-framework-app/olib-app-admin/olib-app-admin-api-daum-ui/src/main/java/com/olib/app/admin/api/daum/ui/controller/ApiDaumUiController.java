package com.olib.app.admin.api.daum.ui.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olib.app.admin.api.daum.ui.domain.ClassInfo;
import com.olib.app.admin.api.daum.ui.service.ApiDaumUiService;
import com.olib.core.util.OlibExceptionUtil;

@Controller
@RequestMapping(value="/api/daum")
public class ApiDaumUiController {
	
	@Autowired
	private ApiDaumUiService service;
	
//------------------------------------------------------------------------------	
	@RequestMapping(value="/main")
	public String main(Model model){
		return "/apidaumui/apidaumui_main";
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
