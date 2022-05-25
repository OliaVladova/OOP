package Encapsulation.PizzaCalories;

public class Topping {
    //toppingType: String
    private String toppingType;
    //weight: double
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        //"Cannot place {name of invalid argument} on top of your pizza."
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            String message = "Cannot place " + toppingType + " on top of your pizza.";
            throw new IllegalArgumentException(message);
        }
    }

    private void setWeight(double weight) {
        //"{Topping type name} weight should be in the range [1..50].".
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            String message = this.toppingType + " weight should be in the range [1..50].";
            throw new IllegalArgumentException(message);
        }
    }
    public double calculateCalories() {

        double toppingTypeCoefficient = 0;
        switch (this.toppingType) {
            case "Meat":
                toppingTypeCoefficient = 1.2;
                break;
            case "Veggies":
                toppingTypeCoefficient = 0.8;
                break;
            case "Cheese":
                toppingTypeCoefficient = 1.1;
                break;
            case "Sauce":
                toppingTypeCoefficient = 0.9;
                break;
        }

        return 2 * this.weight * toppingTypeCoefficient;
    }
}
