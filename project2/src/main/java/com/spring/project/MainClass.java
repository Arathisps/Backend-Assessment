package com.spring.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/project/configProject.xml");
		List<Items> items = new ArrayList<Items>();
		items.add((Items) applicationContext.getBean("item1"));
		items.add((Items) applicationContext.getBean("item2"));
		items.add((Items) applicationContext.getBean("item2"));
		Customer customer = (Customer) applicationContext.getBean("customer");
		OrderService orderService = (OrderService) applicationContext.getBean("orderService");
		orderService.placeOrder(customer, items);
		System.out.println(orderService.getTotal());
	}
}
