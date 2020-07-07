package com.koreait.second.blackjack;

public class Rule {
	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		int lastPoint = 21;
		int gPoint = gamer.getTotalPoint();
		int dPoint = dealer.getTotalPoint();
		
		if(gPoint == dPoint || (gPoint > lastPoint && dPoint > lastPoint)) {
			System.out.println("비겼음");
		} else if((gPoint <= lastPoint && gPoint > dPoint) || dPoint > lastPoint) {
			System.out.println("게이머 승");
		} else {
			System.out.println("딜러 승");
		}
	}
}
