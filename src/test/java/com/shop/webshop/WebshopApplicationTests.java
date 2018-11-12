package com.shop.webshop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shop.webshop.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebshopApplicationTests {

	@Test
	public void contextLoads() {
	}
	/*
	@Test
	public void HomeController() {
		HomeController hc = new HomeController();
		String expected = "I'm running properly!";
		String actual = hc.Index();
		assertEquals(expected,actual);
	}
	*/
}
