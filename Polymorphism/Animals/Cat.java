package Polymorphism.Animals;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String toReturn = super.explainSelf() + "MEEOW";
        return toReturn;
    }
}
