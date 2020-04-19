package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackJack extends Game {

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
        int i = 1;
        do {
            System.out.println("Do you want to play Round " + i + ", y for yes or "
                    + "n for no");
            String choice = in.next();
            if ("y".equals(choice)) {
                bet.setInitialBet(playerBet);
                if (startRound(player)) {
                    System.out.println("Congratulations, You WON the Round " + i);
                    playerBet = bet.calculateWinnings(playerBet);
                    System.out.println("You have now $" + playerBet);
                } else {
                    bet.setInitialBet(playerBet / 2);
                }
                i++;
            } else if ("n".equals(choice)) {

                System.out.println("Now, you have $" + bet.getInitialBet());
                break;
            }
        } while (true);

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

    public static boolean checkWinner(Player player) {
        return (player.getSum() == 21);

    }

    public static boolean startRound(Player player) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's start!");

        player.beginGame();
        player.showCards();

        Player dealer = new Player("Matthew");
        dealer.beginGame();
        dealer.showOneCard();

        System.out.println("The sum of your Cards is: " + player.getCardSum());
        if (checkWinner(player)) {
            return true;

        } else {
            do {
                System.out.println("Press (1) for Hit and (0) for Stand");
                int choice = in.nextInt();
                if (choice == 1) {
                    player.hit();
                    System.out.println("You have the following cards:");
                    player.showCards();
                    System.out.println("The new sum of your Cards is: " + player.getCardSum());
                    if (player.getCardSum() > 21) {
                        System.out.println("Sorry, You LOST this Round!");
                        return false;
                    } else if (player.getCardSum() == 21) {
                        return true;
                    }
                }
                if (choice == 0) {
                    dealer.showCards();

                    while (dealer.getCardSum() <= 16) {

                        if (dealer.getCardSum() == 21) {
                            System.out.println("The dealer has the following cards:");
                            dealer.showCards();
                            System.out.println("The new sum of the dealer's cards is: " + dealer.getCardSum());
                        } else if (dealer.getCardSum() <= 16) {
                            dealer.hit();
                            System.out.println("The dealer has the following cards:");
                            dealer.showCards();
                            System.out.println("The new sum of the dealer's cards is: " + dealer.getCardSum());
                        } else if (dealer.getCardSum() > 21) {
                            System.out.println("The dealer has the following cards:");
                            dealer.showCards();
                            System.out.println("The new sum of the dealer's cards is: " + dealer.getCardSum());
                            System.out.println("Congratulations, You WON this Round!");
                            return true;
                        }
                    }
                    if (dealer.getCardSum() >= 17) {
                        
                        if (dealer.getCardSum() < player.getCardSum()) {
                            System.out.println("The dealer has the following cards:");
                            dealer.showCards();
                            System.out.println("The sum of the dealer's cards is: " + dealer.getCardSum());

                            System.out.println("You has the following cards:");
                            player.showCards();
                            System.out.println("The sum of your cards is: " + player.getCardSum());
                            System.out.println("Sorry, You LOST this Round!");
                            return false;
                        } else if (dealer.getCardSum() == player.getCardSum()) {
                            System.out.println("It is a DRAW");
                            return false;
                        } else if (dealer.getCardSum() == 21 && player.getCardSum() == 21) {
                            System.out.println("It is a DRAW");
                            return false;
                        } else {
                            System.out.println("The dealer has the following cards:");
                            dealer.showCards();
                            System.out.println("The sum of the dealer's cards is: " + dealer.getCardSum());

                            System.out.println("You has the following cards:");
                            player.showCards();
                            System.out.println("The sum of your cards is: " + player.getCardSum());
                            System.out.println("Congratulations, You WON this Round!");
                            return true;
                        }
                    }

                    break;

                }

            } while (true);

        }
        return false;
    }

    public void endRound() {

    }



}