package Polymorphism.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        String[] busInfo = scanner.nextLine().split("\\s+");
        double carFuel = Double.parseDouble(carInfo[1]);
        double carConsumption = Double.parseDouble(carInfo[2]);
        double carCapacity = Double.parseDouble(carInfo[3]);
        double truckFuel = Double.parseDouble(truckInfo[1]);
        double truckConsumption = Double.parseDouble(truckInfo[2]);
        double truckCapacity  = Double.parseDouble(truckInfo[3]);
        double busFuel = Double.parseDouble(busInfo[1]);
        double busConsumption = Double.parseDouble(busInfo[2]);
        double busCapacity  = Double.parseDouble(busInfo[3]);
        Car car = new Car(carFuel,carConsumption,carCapacity);
        Truck truck = new Truck(truckFuel,truckConsumption,truckCapacity);
        Bus bus = new Bus(busFuel,busConsumption,busCapacity);
        int numCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[1]){
                case "Car":
                    if (command[0].equals("Drive")){
                        double distance = Double.parseDouble(command[2]);
                        car.drive(distance);
                    }else if (command[0].equals("Refuel")){
                        double litres = Double.parseDouble(command[2]);
                        car.refuel(litres);
                    }
                    break;
                case "Truck":
                    if (command[0].equals("Drive")){
                        double distance = Double.parseDouble(command[2]);
                        truck.drive(distance);
                    }else if (command[0].equals("Refuel")){
                        double litres = Double.parseDouble(command[2]);
                        truck.refuel(litres);
                    }
                    break;
                case "Bus":
                    if (command[0].equals("Drive")){
                        double distance = Double.parseDouble(command[2]);
                        bus.setFuelConsumption(1.4);
                        bus.drive(distance);
                        bus.setFuelConsumption(-1.4);
                    }else if (command[0].equals("Refuel")){
                        double litres = Double.parseDouble(command[2]);
                        bus.refuel(litres);
                    }else if (command[0].equals("DriveEmpty")){
                        double distance = Double.parseDouble(command[2]);
                        bus.setFuelConsumption(0);
                        bus.drive(distance);
                    }
                    break;
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
}
