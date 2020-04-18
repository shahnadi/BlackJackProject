package ca.sheridancollege.project;

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
//                Card card = new Card();
                
                
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