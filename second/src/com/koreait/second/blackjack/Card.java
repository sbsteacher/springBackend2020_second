package com.koreait.second.blackjack;

public class Card {
	private String pattern;
	private String denomination;
		
	public Card(String pattern, String denomination) {
		this.pattern = pattern;
		this.denomination = denomination;
	}
		
	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}

	@Override
	public String toString() {
		return String.format("p: %s, d: %s"
				, pattern, denomination);
	}
}
