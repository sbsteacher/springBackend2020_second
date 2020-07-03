package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();		
	public CardDeck() {
		init();
	}	
	private void init() {
		for(int i=0; i<Card.PATTERNS.length; i++) {
			for(int z=1; z<=13; z++) {				
				//arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				Card c = new Card(pattern, deno);
				arr.add(c);
			}
		}
	}
	private String getDeno(int num) {		
		switch(num) {
			case 1: return "A";
			case 11: return "J";
			case 12: return "Q";
			case 13: return "K";
			default: return String.valueOf(num);
		}
	}
	/*
	public Card getCard() {
		int rIdx = (int)(Math.random() * arr.size());		
		Card c = arr.get(rIdx);
		arr.remove(rIdx);		
		return c;
	}
	*/
	public Card getCard() {
		int rIdx = (int)(Math.random() * arr.size());
		return arr.remove(rIdx);
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}
}




