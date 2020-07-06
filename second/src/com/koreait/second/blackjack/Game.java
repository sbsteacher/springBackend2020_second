package com.koreait.second.blackjack;

public class Game {

	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();		
		Card c = cd.getCard();
				
		Gamer gamer = new Gamer();
		Card card = cd.getCard();
		gamer.receiveCard(card);
		
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		gamer.openCards();
		
	}

}





