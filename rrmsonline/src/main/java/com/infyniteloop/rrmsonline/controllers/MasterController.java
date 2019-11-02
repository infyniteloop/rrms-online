package com.infyniteloop.rrmsonline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infyniteloop.rrmsbackend.dao.MenuCategoryDAO;
import com.infyniteloop.rrmsbackend.dto.MenuCategory;

@Controller
public class MasterController {
	
	@Autowired
	private MenuCategoryDAO menuCategoryDAO;
	
	// Home Page Example
		@RequestMapping(value = "/show/{id}")
		public ModelAndView showCategory(@PathVariable("id") int id) {		
			ModelAndView mv = new ModelAndView("master");		
			
			MenuCategory menuCategory = null;
			//Fetch the category from id
			menuCategory = menuCategoryDAO.get(id);
			
			
			mv.addObject("title",menuCategory.getName());
			
			//passing the list of categories
			mv.addObject("menuCategories",menuCategoryDAO.list());
			
			//passing a single category
			mv.addObject("menuCategory",menuCategory);
			
			mv.addObject("userClickedCategory",true);
			return mv;				
		}
		
		

}
