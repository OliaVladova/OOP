package Polymorphism.Animals;

public class Dog extends Animal{

    protected Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }
    @Override
    public String explainSelf() {
        String toReturn = super.explainSelf() + "DJAAF";
        return toReturn;
    }
}
