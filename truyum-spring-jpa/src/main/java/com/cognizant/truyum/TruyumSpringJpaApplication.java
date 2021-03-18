package com.cognizant.truyum;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;

@SpringBootApplication
public class TruyumSpringJpaApplication {
	@Autowired
	private static MenuItemService menuItemService;
	private static final Logger LOGGER = LoggerFactory.getLogger(TruyumSpringJpaApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Inside main");
		ApplicationContext context=SpringApplication.run(TruyumSpringJpaApplication.class, args);
		
		menuItemService=context.getBean(MenuItemService.class);
		//testAddItem();
		//testGetMenuItemListAdmin();
		//testGetMenuItemListCustomer();
		//testModifyItem();
		testGetMenuItem(1);
		
		
	}
	
	private static void testAddItem()//use this test to insert Menu Item Object
	{
//		MenuItem menuItem = new MenuItem();
//		menuItem.setName("Sandwich");
//		menuItem.setPrice(99.00);
//		menuItem.setFreeDelivery(true);
//		menuItem.setActive(true);
//		menuItem.setDateOfLaunch(DateUtil.convertToDate("15/03/2017"));
//		menuItem.setCategory("Main Course");
//		menuItemService.modifyMenuItem(menuItem);
		
//		MenuItem menuItem1 = new MenuItem();
//		menuItem1.setName("Burger");
//		menuItem1.setPrice(129.00);
//		menuItem1.setFreeDelivery(false);
//		menuItem1.setActive(true);
//		menuItem1.setDateOfLaunch(DateUtil.convertToDate("23/12/2017"));
//		menuItem1.setCategory("Main Course");
//		menuItemService.modifyMenuItem(menuItem1);
//		
//		MenuItem menuItem2 = new MenuItem();
//		menuItem2.setName("Pizza");
//		menuItem2.setPrice(149.00);
//		menuItem2.setFreeDelivery(false);
//		menuItem2.setActive(true);
//		menuItem2.setDateOfLaunch(DateUtil.convertToDate("21/08/2017"));
//		menuItem2.setCategory("Main Course");
//		menuItemService.modifyMenuItem(menuItem2);
//		
//		MenuItem menuItem3 = new MenuItem();
//		menuItem3.setName("French Fries");
//		menuItem3.setPrice(57.00);
//		menuItem3.setFreeDelivery(true);
//		menuItem3.setActive(false);
//		menuItem3.setDateOfLaunch(DateUtil.convertToDate("02/07/2017"));
//		menuItem3.setCategory("Starters");
//		menuItemService.modifyMenuItem(menuItem3);
		
//		MenuItem menuItem4 = new MenuItem();
//		menuItem4.setName("Chocolate Brownie");
//		menuItem4.setPrice(32.00);
//		menuItem4.setFreeDelivery(true);
//		menuItem4.setActive(true);
//		menuItem4.setDateOfLaunch(DateUtil.convertToDate("02/11/2017"));
//		menuItem4.setCategory("Dessert");
//		menuItemService.modifyMenuItem(menuItem4);
		
		MenuItem menuItem5 = new MenuItem();
		menuItem5.setName("Banana Milkshake");
		menuItem5.setPrice(129.00);
		menuItem5.setFreeDelivery(false);
		menuItem5.setActive(true);
		menuItem5.setDateOfLaunch(DateUtil.convertToDate("23/12/2022"));
		menuItem5.setCategory("Appetizer");
		menuItemService.modifyMenuItem(menuItem5);
	}
	
	private static void testModifyItem()//use this test to insert or update Menu ITem Object
	{
		MenuItem menuItem=menuItemService.getMenuItem(1);
		//menuItem.setId(1);
		//menuItem.setName("Samosa");
		//menuItem.setPrice(10.00);
		//menuItem.setFreeDelivery(true);
		//menuItem.setActive(true);
		//menuItem.setDateOfLaunch(DateUtil.convertToDate("20/01/2009"));
		menuItem.setCategory("Starters");
		menuItemService.modifyMenuItem(menuItem);
		
	}
	private static void testGetMenuItemListAdmin()
	{
		LOGGER.info("Start");	
		LOGGER.debug("MenuItems:: {}",menuItemService.getMenuItemListAdmin());
		LOGGER.info("End");
	}
	
	private static void testGetMenuItemListCustomer()
	{
		LOGGER.info("Start");	
		LOGGER.debug("MenuItems for customer :: {}",menuItemService.getMenuItemListCustomer());
		LOGGER.info("End");
	}
	
	
	private static void testGetMenuItem(Integer id)
	{
		LOGGER.info("Start");	
		LOGGER.debug("Item:: {}",menuItemService.getMenuItem(id));
		LOGGER.info("End");
	}
}