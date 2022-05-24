package WorkingWithAbstraction.CardRanks;


public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        CardRanks[] cards = CardRanks.values();
        for (CardRanks card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",card.ordinal(), card);
        }
    }
}
