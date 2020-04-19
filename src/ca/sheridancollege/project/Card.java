/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author Devansh,Nadir and Asim
 */
public class Card {
    //default modifier for child classes

    private int num;
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Card(int cardNum) {
        this.num = cardNum;
    }

    public void checkVal() {
        if (num == 1) {
            value = 11;
        }
        if (num > 10) {
            value = 10;
        } else {
            value = num;
        }
        setValue(value);
    }

    public void ifAce() {
        System.out.println("Do you want to use your Ace as 1 or 11");
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        if (val != 1 && val != 11) {
            System.out.println("Enter a valid number");
            val = in.nextInt();
        }
        setValue(val);
    }

    public CardNum getName(int index) {

        CardNum s = CardNum.values()[index - 1];
        return s;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public String toString() {

        System.out.print("A card: " + getName(num));
        String format = " of value: %d";
        if (num != 1) {
            return String.format(format, getValue());
        } else {
            return "";
        }
    }

}
