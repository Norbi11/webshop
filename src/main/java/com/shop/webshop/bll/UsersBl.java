package com.shop.webshop.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.webshop.dal.IDatabaseHandler;
import com.shop.webshop.dal.UsersDB;
import com.shop.webshop.dom.Users;

@Service
public class UsersBl implements IDatabaseHandler<Users> {


	private UsersDB usersDB;
	
	@Override
	public List<Users> GetAll() {
		return usersDB.GetAll();
	}

	@Override
	public Users GetById(int id) {
		return usersDB.GetById(id);
	}

	@Override
	public void Insert(Users user) {
		usersDB.Insert(user);
	}

	@Override
	public void Update(Users user) {
		usersDB.Update(user);
	}

	@Override
	public void Delete(int id) {
		usersDB.Delete(id);
	}

	@Override
	public void Save() {
		usersDB.Save();
	}

}
