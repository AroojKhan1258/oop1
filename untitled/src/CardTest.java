public class CardTest {
    public static void main(String[] args){
        Card c1 = new Card("Clubs", "Ace");
        Card c2 = new Card("Clubs", "Ace");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
        Deck myDeck = new Deck();
        System.out.println(myDeck);
        Game game = new Game(myDeck);
        System.out.println(game);


    }
}












