package ca.sheridancollege.project;

import ca.sheridancollege.project.*;
import java.util.ArrayList;

public class Hand {

    private int numOfCards;
    private ArrayList<Card> card;

    public Hand(ArrayList<Card> cards) {
        this.card = cards;
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

    public ArrayList<Card> getCard() {
        return this.card;
    }

    /**
     *
     * @param card
     */
    public void setCard(ArrayList<Card> card) {
        this.card = card;
    }

}