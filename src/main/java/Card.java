public class Card implements Comparable<Card>{
    private String name;
    private String suit;
    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }
    @Override
    public int compareTo(Card given) {
        int myValue = convertNameToInt(this.name);
        int otherValue = convertNameToInt(given.getName());
        if (myValue != otherValue) {
            return myValue - otherValue;
        }
        int mySuit = convertSuitToInt(this.suit);
        int otherSuit = convertSuitToInt(given.getSuit());
        return mySuit - otherSuit;
    }
    private int convertNameToInt(String name) {
        int power = 0;
        switch (this.name) {
            case "Ace": power = 1; break;
            case "2": power = 2; break;
            case "3": power = 3; break;
            case "4": power = 4; break;
            case "5": power = 5; break;
            case "6": power = 6; break;
            case "7": power = 7; break;
            case "8": power = 8; break;
            case "9": power = 9; break;
            case "10": power = 10; break;
            case "Jack": power = 11; break;
            case "Queen": power = 12; break;
            case "King": power = 13; break;
        }
        return power;
    }
    private  int convertSuitToInt(String suit) {
        int power = 0;
        switch (this.suit) {
            case "Hearts": power = 1; break;
            case "Clubs": power = 2; break;
            case "Diamonds": power = 3; break;
            case "Spades": power = 4; break;
        }
        return power;
    }

}
