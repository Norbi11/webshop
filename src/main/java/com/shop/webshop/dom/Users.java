package com.shop.webshop.dom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uid", nullable = false)
	private int uid;
	@Column(name="username", nullable = false)
	private String username;
	@Column(name="ufirstname", nullable = false)
	private String ufirstname;
	@Column(name="ulastname", nullable = false)
	private String ulastname;
	@Column(name="upassword", nullable = false)
	private String upassword;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUfirstname() {
		return ufirstname;
	}
	public void setUfirstname(String ufirstname) {
		this.ufirstname = ufirstname;
	}
	public String getUlastname() {
		return ulastname;
	}
	public void setUlastname(String ulastname) {
		this.ulastname = ulastname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public Users() {
		
	}
	
	public Users(String username, String firstname, String lastname, String password) {
		this.username = username;
		this.ufirstname = firstname;
		this.ulastname = lastname;
		this.upassword = password;
	}
}
