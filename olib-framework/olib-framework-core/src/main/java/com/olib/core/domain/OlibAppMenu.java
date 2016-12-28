package com.olib.core.domain;

import java.util.List;

public class OlibAppMenu {
	
	private String name;														// 메뉴
	private String icon;														// 아이콘 클래스명 (font-awesome)
	private String link;														// 연결링크
	private int order;															// 메뉴 순서
	private List<OlibAppMenu> subMenuList;										// 하위 메뉴리스트
	
	public OlibAppMenu(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<OlibAppMenu> getSubMenuList() {
		return subMenuList;
	}

	public void setSubMenuList(List<OlibAppMenu> subMenuList) {
		this.subMenuList = subMenuList;
	}
	
}
