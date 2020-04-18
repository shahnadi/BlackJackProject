package ca.sheridancollege.project;

import ca.sheridancollege.project.*;
import java.util.ArrayList;

public class Hand {

    private int numOfCards;
    private Card[] card;

    public Hand(ArrayList<Card> cards) {

    }

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
