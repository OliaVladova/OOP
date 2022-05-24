package WorkingWithAbstraction.WorkingwithAbstractionLab;

import java.util.Scanner;

public class P1RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int stars = 1; stars <= size; stars++) {
            printRow(size, stars);
            System.out.println("*");
        }
        for (int stars = size -1; stars >0 ; stars--) {
            printRow(size,stars);
            System.out.println("*");
        }
    }

    private static void printRow(int size, int stars) {
        for (int i = 0; i < size- stars; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < stars - 1; i++) {
            System.out.print("* ");
        }
    }
}
