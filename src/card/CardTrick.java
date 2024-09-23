/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 * @modifier Marcus Grau 991751627
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        // Create a Random object to generate random numbers
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            // Generate a random suit index between 0 and 3
            int suitIndex = rand.nextInt(Card.SUITS.length);
            c.setSuit(Card.SUITS[suitIndex]);
            
            // Generate a random value between 1 and 13
            int value = rand.nextInt(13) + 1;
            c.setValue(value);
            
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }

}
