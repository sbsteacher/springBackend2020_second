package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private List<Card> arr;	
	
	public Gamer() {
		arr = new ArrayList();
	}
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr) {
			sum += c.getPoint();			
		}
		return sum;
	}
	
	public void openCards() {	
		for(Card c : arr) {
			System.out.println(c);
		}
		System.out.printf("점수 : %d\n", getTotalPoint());
	}
}




