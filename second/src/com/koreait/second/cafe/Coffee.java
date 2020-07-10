package com.koreait.second.cafe;

public class Coffee {
	private String name;
	private int price;
	
	public Coffee(MenuItem mi) {
		name = mi.getName();
		price = mi.getPrice();
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	
}
