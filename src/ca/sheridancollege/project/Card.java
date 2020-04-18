/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
    //default modifier for child classes

    private int num;
    private int value;

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public String toString() {
        String format = "A card of value: %d";
        return String.format(format, num);
    }

    ;
    
    public Card(int cardNum) {
        this.num = cardNum;
    }

    /**
     *
     * @param cardNum
     */
    public Card(CardNum cardNum) {
        
    }
    public int getVal(){
        if(num>10){
            value = 10;
        }else{
            value = num;
        }
        return value;
    }

}
