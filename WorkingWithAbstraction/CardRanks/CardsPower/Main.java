package WorkingWithAbstraction.CardsPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit, Card.cardPower(Rank.valueOf(rank),Suit.valueOf(suit)));
    }
}
