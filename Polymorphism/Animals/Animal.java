package Polymorphism.Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf() {
        String toReturn = "I am " + this.name + " and my favourite food is " + this.favouriteFood + "\n";
        return toReturn;
    }


}
