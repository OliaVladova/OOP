package WorkingWithAbstraction.TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] startColors = scanner.nextLine().split("\\s+");
        List<Lights> endLights = new ArrayList<>();
        int times = Integer.parseInt(scanner.nextLine());

        for (String color:startColors) {
            Lights light = new Lights(Color.valueOf(color));
            endLights.add(light);
        }
        for (int i = 0; i < times; i++) {
            endLights.forEach(lights -> {
                lights.updateColor();
                System.out.print(lights.getColor() + " ");
            });
            System.out.println();
        }
    }
}
