
/** Created by Shubham Kumawat on 11/15/2017 */

/**-- 52 cards with:
 ● 4 suits: hearts​, spades​, clubs​, diamonds
 ● Face values of: Ace​, 2-10​, Jack​, Queen​, and King​).
 Within one of your classes, you must provide two operations:
 shuffle()​ - shuffle returns no value, but results in the cards in the deck being randomly
 permuted
 dealOneCard()​ - returns one card from the deck to the caller. Specifically, a call to
 shuffle() followed by 52 calls to dealOneCard() should result in the caller being provided
 all 52 cards of the deck in a random order. If the caller then makes a 53rd call
 dealOneCard(), no card is dealt.
 --*/

import java.util.ArrayList;
import java.util.Random;

public class CardsMain {
    public static void main(String[] args){
        System.out.println("||----------------------Pre-Interview Code------------------------||");
        System.out.println("||-------------------We have a deck of 52 cards-------------------||");
        System.out.println("\n||--We will use the following conventions for better and easy readability--||");
        System.out.println("||-----------H->HEARTS, S->SPADES, C->CLUBS, D->DIAMONDS----------||");
        System.out.println("||--------------A->ACES, K->KINGS, Q->QUEENS, J->JACKS----------------||");

        DeckofCards deck = new DeckofCards();

        // a call to shuffle()
        deck.shuffle();

        // a call to shuffle() followed by 52 calls to dealOneCard()
        System.out.println("\n\nNow we show the cards one by one to the caller:");
        for(int i =0; i< 52; i++){
            String str =  deck.dealOneCard();
            System.out.print(str + " ");
        }

        // Calling dealOneCard 53rd time to display message
        System.out.println("\n\nWhen 53rd card is called, we get the message:");
        String str1 = deck.dealOneCard();
        System.out.print(str1 + " ");
        System.out.println("\n\nTest case passed. Happy Coding!!");
    }
}
