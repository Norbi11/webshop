package com.shop.webshop.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.shop.webshop.dal.DB;
import com.shop.webshop.dal.IDatabaseHandler;
import com.shop.webshop.dom.Users;

@Service
@Scope(value="singleton")
public class UsersBl implements IDatabaseHandler<Users> {
	
	private DB<Users> db;
	
	@Autowired
	private UsersBl(DB<Users> db) {
		this.db = db;
		db.setGenericType(Users.class);
	}
	
	@Override
	public List<Users> GetAll() {
		return db.GetAll();
	}

	@Override
	public Users GetById(int id) {
		return db.GetById(id);
	}

	@Override
	public void Insert(Users user) {
		db.Insert(user);
	}

	@Override
	public void Update(Users user) {
		db.Update(user);
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
