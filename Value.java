import java.util.ArrayList;

/**-- We are assuming the corresponding values for A->ACE, K->KING, Q->QUEEN, J-> JACK  */

public class Value{
    private ArrayList<String> card_Value;

    public Value(){
        card_Value = new ArrayList<String>();
        card_Value.add("A");
        card_Value.add("2");
        card_Value.add("3");
        card_Value.add("4");
        card_Value.add("5");
        card_Value.add("6");
        card_Value.add("7");
        card_Value.add("8");
        card_Value.add("9");
        card_Value.add("10");
        card_Value.add("J");
        card_Value.add("Q");
        card_Value.add("K");
    }

    public ArrayList card_value(){
        return card_Value;
    }
}
