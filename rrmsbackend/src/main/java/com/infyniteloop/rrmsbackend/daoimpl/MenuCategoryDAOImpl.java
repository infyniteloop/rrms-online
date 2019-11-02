package com.infyniteloop.rrmsbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infyniteloop.rrmsbackend.dao.MenuCategoryDAO;
import com.infyniteloop.rrmsbackend.dto.MenuCategory;

@Repository("menuCategoryDAO")
public class MenuCategoryDAOImpl implements MenuCategoryDAO {
	
	
	
	
	
	private static List<MenuCategory> cats = new ArrayList();
	static {
		
		MenuCategory cat1 = new MenuCategory();
		cat1.setId(1);
		cat1.setName("Lobby");
		cat1.setRole("ADMIN");
		
		cats.add(cat1);
		
		MenuCategory cat2 = new MenuCategory();
		cat2.setId(2);
		cat2.setName("Rooms");
		cat2.setRole("ADMIN");
		
		cats.add(cat2);
		
		MenuCategory cat3 = new MenuCategory();
		cat3.setId(3);
		cat3.setName("Biodata");
		cat3.setRole("ADMIN");
		
		cats.add(cat3);
		
		
		
		
		
	}

	@Override
	public List<MenuCategory> list() {
		// TODO Auto-generated method stub
		return cats;
	}

	@Override
	public MenuCategory get(int id) {

		for(MenuCategory category : cats)
		{
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
