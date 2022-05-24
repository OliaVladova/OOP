package WorkingWithAbstraction.PointsRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRectangle = scanner.nextLine().split("\\s+");
        //"{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}"
        int bottomLeftX = Integer.parseInt(inputRectangle[0]);
        int bottomLeftY = Integer.parseInt(inputRectangle[1]);
        int topRightX = Integer.parseInt(inputRectangle[2]);
        int topRightY = Integer.parseInt(inputRectangle[3]);
        Point pointLeft = new Point(bottomLeftX, bottomLeftY);
        Point pointRight = new Point(topRightX, topRightY);
        Rectangle rectangle = new Rectangle(pointLeft, pointRight);
        int numPoints = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numPoints; i++) {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(point));
        }
    }
}
