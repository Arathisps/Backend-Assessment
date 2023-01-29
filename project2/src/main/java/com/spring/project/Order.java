package com.spring.project;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Items> items;
	private Customer customer;
	
	public Order(Customer customer) {
		super();
		this.items = new ArrayList<Items>();
		this.customer = customer;
	}
	
	public void addItem(Items item)
	{
		this.items.add(item);
	}
	
	public double calculateTotal()
	{
		double total = 0;
		for(Items item: items)
		{
			total = total + item.getPrice();
		}
		
		total = total - (total*customer.getDiscount());
		return total;
	}
}
