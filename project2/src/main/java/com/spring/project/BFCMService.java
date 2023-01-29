package com.spring.project;

public class BFCMService {
	public static final double BFCM_discount = 0.15;
	
	public static double applyBFCMdiscount(double total)
	{
		return total = total - (total*BFCM_discount);
	}
}
