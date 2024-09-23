/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

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

        // Add a scanner object
        Scanner scanner = new Scanner(System.in);

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

        // Instead of printing 1 of hearts or 13 of spades, I am replace the correct numbers with their corrosponding match
        for (Card card : magicHand) {
            if (card.getValue() == 1) {
                System.out.println("Ace of " + card.getSuit());
            } else if (card.getValue() == 11) {
                System.out.println("Jack of " + card.getSuit());
            } else if (card.getValue() == 12) {
                System.out.println("Queen of " + card.getSuit());
            } else if (card.getValue() == 13) {
                System.out.println("King of " + card.getSuit());
            } else {
                System.out.println(card.getValue() + " of " + card.getSuit());
            }
        }

        // Ask the user for their card value and suit
        System.out.print("Enter the card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit (0-3) 0-Hearts, 1-Diamonds, 2-Spades, 3-Clubs: ");
        int userSuitIndex = scanner.nextInt();

        // Create the users Card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuitIndex]);

        // Search for the users card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
//            System.out.println(card.getValue() + " of " + card.getSuit());
//
//            System.out.println(userCard.getValue() + " of " + userCard.getSuit());

            if (card.getValue() == userCard.getValue() && card.getSuit() == userCard.getSuit() ) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card (" + userCard.getValue() + " of " + userCard.getSuit() + ") is in the magic hand!");
        } else {
            System.out.println("Your card (" + userCard.getValue() + " of " + userCard.getSuit() + ") is not in the magic hand.");
        }

        // Add a hardcoded Lucky Card (Ace of Hearts)
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit(Card.SUITS[0]);

        // Search for the users card in the magic hand
        boolean lucky = false;
        for (Card card : magicHand) {

            if (card.getValue() == luckyCard.getValue() && card.getSuit() == luckyCard.getSuit() ) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("You are lucky, Congradulations on your win!!!");
        } else {
            System.out.println("Your are not a winner, sorry.");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }

}
