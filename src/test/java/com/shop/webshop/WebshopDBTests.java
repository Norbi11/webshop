package com.shop.webshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shop.webshop.controller.HomeController;
import com.shop.webshop.database.WSDatabase;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebshopDBTests {

	@Autowired
	private static WSDatabase db;
	private static Connection conn;
	private static DatabaseMetaData dbmd;
	
	@BeforeClass
    public static void setUp() {
		try {
			conn = db.getConn();
			dbmd = conn.getMetaData();
		} catch (Exception e) {
		}
    }
		
	@Test
	public void IsProuctTableExists(){
		try {
			ResultSet rs = dbmd.getTables(null, "APP", "PRODUCT", null);
			assertTrue(rs.next());
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	@Test
	public void IsStockTableExists(){
		try {
			ResultSet rs = dbmd.getTables(null, "APP", "STOCK", null);
			assertTrue(rs.next());
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	@Test
	public void IsUsersTableExists(){
		try {
			ResultSet rs = dbmd.getTables(null, "APP", "USERS", null);
			assertTrue(rs.next());
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	@Test
	public void IsOrderItemsTableExists(){
		try {
			ResultSet rs = dbmd.getTables(null, "APP", "ORDERITEMS", null);
			assertTrue(rs.next());
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	@Test
	public void IsOrdersTableExists(){
		try {
			ResultSet rs = dbmd.getTables(null, "APP", "ORDERS", null);
			assertTrue(rs.next());
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	
	@AfterClass
    public static void tearDown() {
        conn = null;
        dbmd = null;
    }
}

