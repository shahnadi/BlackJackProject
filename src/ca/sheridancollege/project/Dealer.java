package ca.sheridancollege.project;

import ca.sheridancollege.project.*;
import java.util.ArrayList;

public class Dealer extends Player {

    private Hand dealerHand;

    public Dealer(String name) {
        super(name);
    }

    public Card dealCards() {
        // TODO - implement Dealer.dealCards
        throw new UnsupportedOperationException();
    }

    public void play() {
        // TODO - implement Dealer.play
        throw new UnsupportedOperationException();
    }

    

    public int getCardSum() {
        // TODO - implement Dealer.getCardSum
        throw new UnsupportedOperationException();
    }

    public void showOneCard() {
        ArrayList<Card> finalHand = this.dealerHand.getCard();
        System.out.println("The dealer has following cards");
        Card card = finalHand.get(0);
        System.out.println(card.toString());

    }

//    @Override
//    public void showCards() {
//        ArrayList<Card> finalHand = this.dealerHand.getCard();
//        System.out.println("You have the following cards");
//        for (int i = 0; i < finalHand.size(); i++) {
//            Card card = finalHand.get(i);
//            System.out.println(card.toString());
//        }
//    }

}
