package com.yog.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yog.shoppingbackend.dao.CategoryDAO;
import com.yog.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for Television");
		category.setImageURL("Cat_1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description for Mobile");
		category.setImageURL("Cat_2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for Laptop");
		category.setImageURL("Cat_3.png");
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories)
			if(category.getId()==id){
				return category;
			}
		return null;
	}
	

}
