package com.infyniteloop.rrmsonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class BiodataController {
	
	// Home Page Example
	@RequestMapping(value = {"/home"})
	public ModelAndView index(@RequestParam(name="logout",required=false)String logout) {		
		ModelAndView mv = new ModelAndView("home");		
		mv.addObject("title","Home");
		return mv;				
	}
	
	
	
	
	
}
