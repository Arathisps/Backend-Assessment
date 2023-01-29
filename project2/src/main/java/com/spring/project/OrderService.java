package com.spring.project;

import java.util.List;

public class OrderService {
	private boolean isBFCM;
	private double total;
	public OrderService(boolean isBFCM) {
		super();
		this.isBFCM = isBFCM;
	}
	
	public double getTotal() {
		return total;
	}

	public void placeOrder(Customer customer, List<Items> items) {
		Order order = new Order(customer);
		for (Items item : items) {
			order.addItem(item);
		}

		total = order.calculateTotal();
		if (isBFCM) {
			total = BFCMService.applyBFCMdiscount(total);
		}
	}
	
}
