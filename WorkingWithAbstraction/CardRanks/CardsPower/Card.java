package WorkingWithAbstraction.CardsPower;

public class Card {
    public static int cardPower(Rank cardRank, Suit cardSuit){
        int power = cardRank.getRankPower() + cardSuit.getSuitPower();
        return power;
    }
}
