/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> deck = new ArrayList<>();
    
    public GroupOfCards(){
        int j = 0;
        for (int i = 0; i < 52; i++) {
            
                if(i%4==0){
                    j++;
                }
                Card card = new Card(j);
                deck.add(card);
//                System.out.println(i+", "+j+", "+card);
            
        }
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> getDeck()
    {
        Collections.shuffle(deck);
        return deck;
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

   
    
}//end class
