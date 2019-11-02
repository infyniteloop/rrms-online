package com.infyniteloop.rrmsonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infyniteloop.rrmsbackend.dao.MenuCategoryDAO;



@Controller
public class ExampleController {
	
	@Autowired
	private MenuCategoryDAO menuCategoryDAO;
	
	// Home Page Example
	@RequestMapping(value = {"/", "/home" , "/index"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("master");		
		mv.addObject("title","Home");
		mv.addObject("menuCategories",menuCategoryDAO.list());
		mv.addObject("userClickedHome",true);
		return mv;				
	}
	
	
	// About Page Navigation Example
		@RequestMapping(value = {"/about"})
		public ModelAndView about() {		
			ModelAndView mv = new ModelAndView("master");		
			mv.addObject("title","About Us");
			mv.addObject("userClickedAbout",true);
			return mv;				
		}
		
	// About Page Navigation Example
		@RequestMapping(value = {"/contact"})
		public ModelAndView contact() {		
			ModelAndView mv = new ModelAndView("master");		
			mv.addObject("title","Contact Us");
			mv.addObject("userClickedContact",true);
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
