package Encapsulation.AnimalFarm;

public class Chicken {
    //name: String
    private String name;
    //age: int
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private void setAge(int age) {
        if (age <= 15 && age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double product = 0;
        //•	First 6 years it produces 2 eggs per day [0 - 5].
        if (this.age <= 5) {
            product = 2;
        } else if (this.age <= 11) {
            product = 1;
        } else if (this.age > 11) {
            product = 0.75;
        }
        return product;
    }
    @Override
    public String toString(){
        //Chicken Chichi (age 10) can produce 1.00 eggs per day.
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name, this.age, productPerDay()));
        return builder.toString();
    }
}
