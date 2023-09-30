import java.util.Random;

public class Deck {
    Card cards[]= new Card[52];
    String suit[]= new String[4];

    {

        suit[0] = "Clubs";
        suit[1] = "Hearts";
        suit[2] = "Diamonds";
        suit[3] = "Spades";
    }

    String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "cards", "jack", "queen"};

    Deck() {
        int counter = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                cards[counter++] = new Card(suit[j], rank[i]);
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 52; i++) {
            result.append(cards[i] + "\n");
        }
        return result.toString();
    }
    public void Shuffle() {
        Random random = new Random();
        for (int i = 0; i < 6000; i++) {
            int randomIndex = random.nextInt(52);
            Card temp = cards[randomIndex];
            cards[randomIndex] = cards[i];
            cards[i] = temp;
        }
    }
}

