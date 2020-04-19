package ca.sheridancollege.project;

public class Bet {

    private int initialBet;
    private int finalBet;

    public Bet(int num) {
        this.initialBet = num;
    }

    public int getInitialBet() {
        return this.initialBet;
    }

    /**
     *
     * @param initialBet
     */
    public void setInitialBet(int initialBet) {
        this.initialBet = initialBet;
    }

    /**
     *
     * @param initialBet
     * @return
     */
    public int calculateWinnings(int initialBet) {
        this.finalBet = initialBet * 2;
        return finalBet;
    }

}