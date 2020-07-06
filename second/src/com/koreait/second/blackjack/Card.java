package com.koreait.second.blackjack;

public class Card {
	public final static String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private final String pattern;
	private final String denomination;
	private final int point;
		
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
		
	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}

	@Override
	public String toString() {
		return String.format("p: %s, d: %s, p:%d"
				, pattern, denomination, point);
	}
}
