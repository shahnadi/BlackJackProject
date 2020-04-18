/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 */
public class Player {
    //var created
    private String playerID;
    private Hand playerHand; //the unique ID for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    public int getMoney() {
        // TODO - implement Player.getMoney
        throw new UnsupportedOperationException();
    }

    public int getCardSum() {
       ArrayList<Card> finalHand = this.playerHand.getCard();
        int sum = 0;
        for (int i = 0; i < finalHand.size(); i++) {
            Card card = finalHand.get(i);
            
            sum+=card.getVal();
        }
        return sum;
    }

    public Card hit() {
        // TODO - implement Player.hit
        throw new UnsupportedOperationException();
    }

    public void setHand(Hand player_hand) {
        this.playerHand = player_hand;
    }
    
    public void showOneCard() {
        ArrayList<Card> finalHand = this.playerHand.getCard();
        System.out.println("The dealer has following cards");
        Card card = finalHand.get(0);
        System.out.println(card.toString());

    }

    public void showCards() {
        ArrayList<Card> finalHand = this.playerHand.getCard();
        System.out.println("You have the following cards");
        for (int i = 0; i < finalHand.size(); i++) {
            Card card = finalHand.get(i);
            card.checkVal();
            System.out.println(card.toString());
        }
    }

    void beginGame() {
                GroupOfCards deck = new GroupOfCards();
                deck.shuffle();
                ArrayList<Card> shuffled_deck = deck.getDeck();
                ArrayList<Card> player_cards = new ArrayList<>();
                player_cards.add(shuffled_deck.get(0));
                player_cards.add(shuffled_deck.get(1));
               
                Hand player_hand = new Hand(player_cards);
                setHand(player_hand);
                
    }
   

}
