package WorkingWithAbstraction.CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        CardSuit[] cards = CardSuit.values();
        for (CardSuit card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",card.ordinal(), card);
        }
    }
}
