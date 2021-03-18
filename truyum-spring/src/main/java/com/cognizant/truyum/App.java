package com.cognizant.truyum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;


public class App {
	@Autowired
	private static MenuItemService menuItemService;

	public static void main(String[] args) {
		//List<MenuItem> menuItemListAdmin = testGetMenuItemListAdmin();
		//System.out.println(menuItemListAdmin);

		// List<MenuItem> menuItemListCustomer = testGetMenuItemListCustomer();
		// System.out.println(menuItemListCustomer);

		// MenuItem menuItem = testGetMenuItem(1);
		// System.out.println(menuItem);

		// testModification();
	}

	public static List<MenuItem> testGetMenuItemListAdmin() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		menuItemService = (MenuItemService) ctx.getBean("menuItemService");
		return menuItemService.getMenuItemListAdmin();
	}

	public static List<MenuItem> testGetMenuItemListCustomer() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		menuItemService = (MenuItemService) ctx.getBean("menuItemService");
		return menuItemService.getMenuItemListCustomer();
	}

	public static MenuItem testGetMenuItem(long id) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		menuItemService = (MenuItemService) ctx.getBean("menuItemService");
		return menuItemService.getMenuItem(id);
	}

	public static void testModification() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		menuItemService = (MenuItemService) ctx.getBean("menuItemService");

		MenuItem menuItem = testGetMenuItem(1);
		System.out.println("Before Modification :: " + menuItem);
		menuItem.setPrice(500f);
		menuItemService.modifyMenuItem(menuItem);

		System.out.println("After Modification :: " + menuItemService.getMenuItem(1));

	}
}
