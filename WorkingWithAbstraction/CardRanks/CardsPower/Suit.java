package WorkingWithAbstraction.CardsPower;

public enum Suit {
    CLUBS(0), DIAMONDS (13), HEARTS (26), SPADES (39);
    private int suitPower;

    Suit(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
