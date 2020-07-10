package com.koreait.second.cafe;

public class Cafe {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bas = new Barista();
				
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);		
		cus.drinkCoffee(coffee);
		
	}

}






