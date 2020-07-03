package com.koreait.second.blackjack;

public class Game {

	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();		
		Card c = cd.getCard(); 
		//랜덤한 카드를 1장 리턴 and 카드덱에서 리턴한 카드 삭제
		System.out.println(c);
		System.out.println(cd);
		
	}

}





