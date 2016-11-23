/**
 * 
 */
package com.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.service.DemoService;

/**
 * @author shipengfei
 *
 */

@Controller
@RequestMapping("/demoController")
public class DemoController {
	
	final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/demoShow", method=RequestMethod.GET)
	public String demoShow(Model model){
		model.addAttribute("name", "name test");
		model.addAttribute("time", new Date());
		logger.info("DemoController: from controller.");
		return "demo";
	}

	public DemoService getDemoService() {
		return demoService;
	}

	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}
	
	
}
