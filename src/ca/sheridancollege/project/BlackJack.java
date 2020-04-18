package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack extends Game{

	/**
	 * 
     * @param args
	 */
	public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
		GroupOfCards deck = new GroupOfCards();
                System.out.print("What is your name?");
                String playerName = in.nextLine();
                Player player = new Player(playerName);
                System.out.print("How much would you like to bet?");
                int playerBet = in.nextInt();
                Bet bet = new Bet(playerBet);
                System.out.println("Let's start!");
                
                deck.shuffle();
                ArrayList<Card> shuffled_deck = deck.getDeck();
                ArrayList<Card> player_cards = new ArrayList<>();
                player_cards.add(shuffled_deck.get(0));
                player_cards.add(shuffled_deck.get(1));
                
                Hand player_hand = new Hand(player_cards);
                player.setHand(player_hand);
                player.showCards();
                
                deck.shuffle();
                shuffled_deck=deck.getDeck();
                Player dealer = new Player("Matthew");
                ArrayList<Card> dealer_cards = new ArrayList<>();
                dealer_cards.add(shuffled_deck.get(2));
                dealer_cards.add(shuffled_deck.get(3));
                Hand dealer_hand = new Hand(player_cards);
                dealer.setHand(dealer_hand);
                dealer.showOneCard();
                
                
                
                
                
	}

    public BlackJack(String givenName) {
        super(givenName);
    }

	/**
	 * 
	 */
	

        @Override
	public void play() {
		
	}

        @Override
	public void declareWinner() {
		
	}

	public void startRound() {
		
	}

	public void endRound() {
		
	}

	public int calculateSum() {
        return 0;
		
	}

}