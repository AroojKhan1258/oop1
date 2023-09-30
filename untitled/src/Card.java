public class Card {
    String suit;
    String rank;
    //a constructor is added.

    Card(String suit, String rank){
        this. suit = suit;
        this . rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return String.format("%s%s", suit , rank);
    }
    public boolean equals(Object o){
        Card temp = (Card)o;
        return rank.equals(temp.rank) && suit.equals(temp.suit);
    }
}

