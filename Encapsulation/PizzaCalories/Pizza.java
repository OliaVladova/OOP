package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    //name: String
    private String name;
    //dough:  Dough
    private Dough dough;
    //toppings: List<Topping>
    private List<Topping> toppings;

    public Pizza(String name, int numToppings) {
        setName(name);
        setToppings(numToppings);
    }
    private void setToppings(int count) {
        if (count >= 0 && count <= 10) {
            this.toppings = new ArrayList<>(count);
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if (name.trim().length() >= 1 && name.trim().length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public String getName() {
        return name;
    }
    public void addTopping (Topping topping){
        this.toppings.add(topping);
    }
    public double getOverallCalories() {
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
