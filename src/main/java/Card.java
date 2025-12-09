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
        int givenValue = convertNameToInt(given.getName());
        int mySuit = convertSuitToInt(this.suit);
        int givenSuit = convertSuitToInt(given.getSuit());
        boolean isValueEqual = myValue == givenValue;
        boolean isSuitEqual = mySuit == givenSuit;
        if (isValueEqual && isSuitEqual) {
            return 0;
        }
        if (isValueEqual && !isSuitEqual) {
            return mySuit - givenSuit;
        }
        if (isSuitEqual && !isValueEqual) {
            return myValue - givenValue;
        }
        return -1; // edge case
    }
    private int convertNameToInt(String name) {
        int power = 0;
        switch (name) {
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
        switch (suit) {
            case "Hearts": power = 1; break;
            case "Clubs": power = 2; break;
            case "Diamonds": power = 3; break;
            case "Spades": power = 4; break;
        }
        return power;
    }

}
