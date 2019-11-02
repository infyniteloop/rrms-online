package com.infyniteloop.rrmsbackend.dao;

import java.util.List;

import com.infyniteloop.rrmsbackend.dto.MenuCategory;

public interface MenuCategoryDAO {

	List<MenuCategory> list();
	MenuCategory get(int id);
}
