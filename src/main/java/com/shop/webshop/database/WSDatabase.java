package com.shop.webshop.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;


@Service
public class WSDatabase {
	
	final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	final String URL = "jdbc:derby:webshopDB;create=true";
//	final String USERNAME ="";
//	final String PASSWORD ="";
	Connection conn = null;
	Statement createStatement = null;
	
	public Connection getConn() {
		return conn;
	}
	
	public WSDatabase() {
		try {
			conn = DriverManager.getConnection(URL);
			System.out.println("DB Connection was successful!");
		} catch (SQLException ex) {
			Logger.getLogger(WSDatabase.class.getName()).log(Level.SEVERE,null,ex);
			System.out.println("Connection ERROR! \n"+ex);
		}
		
		if(conn != null) {
			try {
				createStatement = conn.createStatement();
			} catch (SQLException ex) {
				Logger.getLogger(WSDatabase.class.getName()).log(Level.SEVERE,null,ex);
				System.out.println("CreateStatement ERROR \n"+ex);
			}
		}
		
		DatabaseMetaData dbmd = null;
		try {
			dbmd = conn.getMetaData();
			System.out.println("Loading metadata was successful!");
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(WSDatabase.class.getName()).log(Level.SEVERE,null,ex);
			System.out.println("DatabaseMetaData ERROR! \n"+ex);
		}
		
		try {
			ResultSet rs1 = dbmd.getTables(null, "APP", "PRODUCTS", null);
			if (!rs1.next()) {
				createStatement.execute("create table PRODUCTS(pid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), pname varchar(60) NOT NULL, pprice double, pweight int, pdescription varchar(200))");
			}
			ResultSet rs2 = dbmd.getTables(null, "APP", "STOCK", null);
			if (!rs2.next()) {
				createStatement.execute("create table STOCK(sid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), pid int NOT NULL, pammount int NOT NULL, pshipingprice double, shipingtime int)");
			}
			ResultSet rs3 = dbmd.getTables(null, "APP", "USERS", null);
			if (!rs3.next()) {
				createStatement.execute("create table USERS(uid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), username varchar(60), ufirstname varchar(60), ulastname varchar(60), upassword varchar(60))");
			}
			ResultSet rs4 = dbmd.getTables(null, "APP", "ORDERITEMS", null);
			if (!rs4.next()) {
				createStatement.execute("create table ORDERITEMS(iid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),oid int NOT NULL, pid int NOT NULL, pamount int NOT NULL)");
			}
			ResultSet rs5 = dbmd.getTables(null, "APP", "ORDERS", null);
			if (!rs5.next()) {
				createStatement.execute("create table ORDERS(oid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), uid int NOT NULL)");
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(WSDatabase.class.getName()).log(Level.SEVERE,null,ex);
			System.out.println("Database table creation ERROR! \n"+ex);
		}
	}
}
