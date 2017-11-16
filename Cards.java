public class Cards{
    private String number;
    private char category;
    private String s;

    public Cards(char category, String number){
        this.number = number;
        this.category = category;
        s = category + "" + number;
    }

    public String getNumber(){
        return number;
    }

    public char category(){
        return category;
    }

    public String toString(){
        return s+" ";
    }
}
