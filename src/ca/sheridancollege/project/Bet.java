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
	 */
	public int calculateWinnings(int initialBet) {
		// TODO - implement Bet.calculateWinnings
		throw new UnsupportedOperationException();
	}

}