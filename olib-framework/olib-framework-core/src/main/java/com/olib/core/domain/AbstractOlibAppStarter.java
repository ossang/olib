package com.olib.core.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.ClassPathResource;

import com.olib.core.env.OlibPropertiesCode;

public abstract class AbstractOlibAppStarter implements InitializingBean{
	
	protected OlibAppMenu menu;
	protected Properties properties;
	
//------------------------------------------------------------------------------
	public abstract String getModuleName();	// 프로퍼티 파일명과 일치해야함
//------------------------------------------------------------------------------
	public void afterPropertiesSet() throws Exception {
		this.properties = loadProperties();
		this.menu = getMenu(properties);
	}
	
//------------------------------------------------------------------------------
// 모듈명의 프로퍼티 반환	
//------------------------------------------------------------------------------	
	public Properties loadProperties() {
		ClassPathResource cpr = new ClassPathResource(
				OlibPropertiesCode.PROPERTIES_DIR
				+ getModuleName() 
				+ OlibPropertiesCode.PROPERTIES_EXT);
		
		Properties properties = new Properties();
		try {
			properties.load(cpr.getInputStream());
			return properties;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//------------------------------------------------------------------------------
// 모듈의 메뉴정보 반환	(서브메뉴와 서브링크는 갯수가 일치해야함)
//------------------------------------------------------------------------------	
	public OlibAppMenu getMenu(Properties properties){
		if(properties == null) return null;
		OlibAppMenu menu = new OlibAppMenu();
		menu.setName(properties.getProperty(OlibPropertiesCode.MENU_NAME));
		menu.setIcon(properties.getProperty(OlibPropertiesCode.MENU_ICON));
		menu.setOrder(0);
		
		List<OlibAppMenu> subMenuList = new ArrayList<>();
		String[] subMenuName = properties.getProperty(OlibPropertiesCode.MENU_SUBMENU).split(",");
		String[] subMenuLink = properties.getProperty(OlibPropertiesCode.MENU_SUBMENU_LINK).split(",");
		
		if(subMenuName.length == subMenuLink.length){
			for(int i =0; i<subMenuName.length; i++){
				OlibAppMenu subMenu = new OlibAppMenu();
				subMenu.setName(subMenuName[i]);
				subMenu.setOrder(i);
				subMenu.setLink(subMenuLink[i]);
				subMenuList.add(subMenu);
			}
		}
		
		menu.setSubMenuList(subMenuList);
		
		return menu;
	}
//------------------------------------------------------------------------------
// getter & setter
//------------------------------------------------------------------------------
	public OlibAppMenu getMenu() {
		return menu;
	}
	
	public Properties getProperties(){
		return this.properties;
	}
	
}
