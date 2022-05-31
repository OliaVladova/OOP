package Polymorphism.WildFarm;

public abstract class Animal {
   private String animalName;
 private  String animalType;
   private double animalWeight;
   private int foodEaten = 0;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();
    public  void eat(Food food){
        this.foodEaten += food.getQuantity();
    };

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
}
