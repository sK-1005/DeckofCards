import java.util.ArrayList;

/**-- Here we define the category/suits for our use H->HEARTS, S->SPADES, C->CLUBS, D->DIAMOND*/

public class Suit{
    private ArrayList<Character> card_Category;

    public Suit(){
        card_Category = new ArrayList<Character>();
        card_Category.add('H');
        card_Category.add('S');
        card_Category.add('C');
        card_Category.add('D');
    }

    public ArrayList card_category(){
        return card_Category;
    }
}
