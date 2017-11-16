import java.util.ArrayList;
import java.util.Random;

public class DeckofCards {
    private ArrayList<Cards> card;
    private Suit cat;
    private ArrayList<Character> cat1;
    private Value val;
    private ArrayList<String> val1;
    private int Cards_left_in_deck;

    /**Constructs new deck of 52 cards */

    public DeckofCards() {
        Cards_left_in_deck = 52;
        card = new ArrayList<Cards>();
        cat = new Suit();
        cat1 = cat.card_category();
        val = new Value();
        val1 = val.card_value();

        for (int j = 0; j < cat1.size(); j++) {
            for (int k = 0; k < val1.size(); k++) {
                card.add(new Cards(cat1.get(j), val1.get(k)));
            }
        }

        System.out.println("\nDeck of 52 cards contains:");
        for (int i = 0; i < card.size(); i++) {
            System.out.print(card.get(i).toString());
        }
    }

    /** Shuffle() - shuffle returns no value, but results in the cards in the deck being randomly permuted */

    public void shuffle() {
        int swapIndex;
        Cards temp;
        Random random_index = new Random();

        for (int i = 0; i < Cards_left_in_deck; i++) {

            // pick a random index
            swapIndex = random_index.nextInt(Cards_left_in_deck);

            // swap current index with random index
            temp = card.get(i);
            card.set(i,card.get(swapIndex));
            card.set(swapIndex, temp);
        }

        System.out.println("\n\nAfter random shuffle, our deck of 52 cards:");
        for (int w = 0; w < card.size(); w++) {
            System.out.print(card.get(w).toString());
        }
    }

    /** dealOneCard() - returns one card from the shuffled deck to the caller
     * If no card left, message will be printed.
     * Here, always the top card from the shuffled deck is returned to caller */

    public String dealOneCard(){
        if(Cards_left_in_deck == 0){
            return ("Sorry! 53rd card is not present. All 52 cards has been drawn above.");
        }
        else{
            Cards_left_in_deck--;
        }
        return (card.get(Cards_left_in_deck).toString());
    }
}
