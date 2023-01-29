package com.spring.project;

public class Customer {
	private int orderCount;
	private double discount;
	
	public Customer()
	{
		this.orderCount = 0;
		this.discount = 0;
	}
	
	public int getOrderCount() {
		return orderCount;
	}

	public double getDiscount() {
		return discount;
	}

	public void placeOrder()
	{
		this.orderCount++;
		updateDiscount();
	}
	
	public void updateDiscount()
	{
		if(this.orderCount > 20)
		{
			this.discount = 0.2;
		}else if(this.orderCount > 10)
		{
			this.discount = 0.1;
		}
	}
}
