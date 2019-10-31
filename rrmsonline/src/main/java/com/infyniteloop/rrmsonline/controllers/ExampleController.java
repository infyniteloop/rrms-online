package com.infyniteloop.rrmsonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ExampleController {
	
	// Home Page Example
	@RequestMapping(value = {"/", "/index"})
	public ModelAndView index(@RequestParam(name="logout",required=false)String logout) {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","Home");
		return mv;				
	}
	
	
	
	
	
	// @RequestParam Example
	// Params mandatory
	@RequestMapping(value="/rp1")
	public ModelAndView requestParamExample1(@RequestParam(name="greeting") String greeting) {
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title",greeting);
		return mv;
	}
	
	// Params not mandatory
	@RequestMapping(value="/rp2")
	public ModelAndView requestParamExample2(@RequestParam(name="greeting", required = false) String greeting) {
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title",greeting);
		return mv;
	}

	
	
	
	// @PathVariable Example
	@RequestMapping(value = "/pm/{id}")
	public ModelAndView pathVariableExample(@PathVariable("id") String id) {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title",id);
		return mv;
	}	
	
	
	
	
}
