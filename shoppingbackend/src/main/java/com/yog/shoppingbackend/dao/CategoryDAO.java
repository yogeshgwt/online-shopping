package com.yog.shoppingbackend.dao;

import java.util.List;

import com.yog.shoppingbackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category get(int id);
}
