package WorkingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int x = dimensions[0];
            int y = dimensions[1];

            int[][] matrix = new int[x][y];

            int value = 0;
        fillMatrix(x, y, matrix, value);

        String command = scanner.nextLine();
            long sum = 0;
            while (!command.equals("Let the Force be with you"))
            {
                int[] personCoordinates = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
                int[] evil = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                int evilX = evil[0];
                int evilY = evil[1];

                moveEvil(matrix, evilX, evilY);

                int personX = personCoordinates[0];
                int personY = personCoordinates[1];

                sum = movePerson(matrix, sum, personX, personY);

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static long movePerson(int[][] matrix, long sum, int personX, int personY) {
        while (personX >= 0 && personY < matrix[1].length)
        {
            if (personX >= 0 && personX < matrix.length && personY >= 0 && personY < matrix[0].length)
            {
                sum += matrix[personX][personY];
            }

            personY++;
            personX--;
        }
        return sum;
    }

    private static void moveEvil(int[][] matrix, int evilX, int evilY) {
        while (evilX >= 0 && evilY >= 0)
        {
            if (evilX >= 0 && evilX < matrix.length && evilY >= 0 && evilY < matrix[0].length)
            {
                matrix[evilX] [evilY] = 0;
            }
            evilX--;
            evilY--;
        }
    }

    private static void fillMatrix(int x, int y, int[][] matrix, int value) {
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                matrix[i][j] = value++;
            }
        }
    }
}
