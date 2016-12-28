package com.olib.app.agent.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/agentui")
public class AgentUiController {

	@RequestMapping(value="/main")
	public String agentUiMain(){
		return "/agentui/agentui_main";
	}
}
