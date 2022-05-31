package Polymorphism.WildFarm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion}".
        String input = scanner.nextLine();

        Map<Animal, Food> farm = new LinkedHashMap<>();
        while (!input.equals("End")) {
            Animal animal = getAnimal(input);
            Food food = getFood(scanner);
            farm.putIfAbsent(animal,food);
            input = scanner.nextLine();
        }
        for (Map.Entry<Animal, Food> animal:farm.entrySet()) {
            animal.getKey().makeSound();
            animal.getKey().eat(animal.getValue());
            System.out.println(animal.getKey().toString());
        }
    }

    private static Food getFood(Scanner scanner) {
        String[] foodInput = scanner.nextLine().split("\\s+");
        String foodType = foodInput[0];
        Integer quantity = Integer.parseInt(foodInput[1]);
        Food food = null;
        switch (foodType) {
            case "Vegetable":
                food = new Vegetable(quantity);
                break;
            case "Meat":
                food = new Meat(quantity);
                break;
        }
        return food;
    }

    private static Animal getAnimal(String input) {
        String[] diffInput = input.split("\\s+");
        String animalType = diffInput[0];
        String animalName = diffInput[1];
        double animalWeight = Double.parseDouble(diffInput[2]);
        String animalLivingRegion = diffInput[3];
        Animal animal = null;
        switch (diffInput[0]) {
            case "Cat":
                String catBreed = diffInput[4];
                animal= new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
                break;
            case "Tiger":
                animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Mouse":
                animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                break;
        }
        return animal;
    }
}
