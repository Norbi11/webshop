package com.shop.webshop.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.shop.webshop.dal.DB;
import com.shop.webshop.dal.IDatabaseHandler;
import com.shop.webshop.dom.Products;

@Service
@Scope(value="singleton")
public class ProductsBl implements IDatabaseHandler<Products> {
	
	private DB<Products> db;
	
	@Autowired
	private ProductsBl(DB<Products> db) {
		this.db = db;
		db.setGenericType(Products.class);
	}
	
	@Override
	public List<Products> GetAll() {
		return db.GetAll();
	}

	@Override
	public Products GetById(int id) {
		return db.GetById(id);
	}

	@Override
	public void Insert(Products product) {
		db.Insert(product);
	}

	@Override
	public void Update(Products product) {
		db.Update(product);
	}

	@Override
	public void Delete(int id) {
		db.Delete(id);
	}

	@Override
	public void Save() {
		db.Save();
	}

}
