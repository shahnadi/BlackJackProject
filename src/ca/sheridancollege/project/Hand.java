package ca.sheridancollege.project;

import ca.sheridancollege.project.*;

public class Hand {

	private int numOfCards;
	private Card[] card;

	public int getNumOfCards() {
		return this.numOfCards;
	}

	/**
	 * 
	 * @param numOfCards
	 */
	public void setNumOfCards(int numOfCards) {
		this.numOfCards = numOfCards;
	}

	public Card[] getCard() {
		return this.card;
	}

	/**
	 * 
	 * @param card
	 */
	public void setCard(Card[] card) {
		this.card = card;
	}

}