/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 */
public class Player {

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
        // TODO - implement Player.getCardSum
        throw new UnsupportedOperationException();
    }

    public Card hit() {
        // TODO - implement Player.hit
        throw new UnsupportedOperationException();
    }

}
