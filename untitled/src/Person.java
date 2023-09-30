public class Person {
    private String name;
    private int score;

    //utrghh
    public Card inhand[] = new Card[52/4];


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<52/4;i++) {
            str.append(inhand[i] + " ");

        }
        return str.toString();
    }
}







