package com.olib.core.base;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olib.core.domain.AbstractOlibAppStarter;
import com.olib.core.domain.OlibAppMenu;

public class BaseSiteController implements InitializingBean{

	private List<AbstractOlibAppStarter> starterList;
	
	@Autowired
	private ListableBeanFactory beanFactory;
//------------------------------------------------------------------------------
	@Override
	public void afterPropertiesSet() throws Exception {
		starterList = new ArrayList<>();
		starterList.addAll(
				beanFactory.getBeansOfType(
						AbstractOlibAppStarter.class).values());
		
	}
//------------------------------------------------------------------------------
	
	@RequestMapping({"/login","/"})
	public String login(HttpServletRequest request, Model model){
		model.addAttribute("contextpath", request.getContextPath());
		return "/login";
	}
	
	@RequestMapping("/main")
	public String siteMain(){
		return "/main";
	}
	
	@ResponseBody
	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public List<OlibAppMenu> menu(){
		return starterList.stream()
				.map(AbstractOlibAppStarter::getMenu)
				.collect(Collectors.toList());
	}
	
}
