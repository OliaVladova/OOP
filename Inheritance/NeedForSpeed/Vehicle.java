package Inheritance.NeedForSpeed;

public class Vehicle {
    //•	DEFAULT_FUEL_CONSUMPTION – final static double (constant)
    //•	fuelConsumption –double
    private double fuelConsumption;
    //•	fuel – double
    private double fuel;
    //•	horsePower – int
    private int horsePower;
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public Vehicle(double fuel, int horsePower) {
        this.fuelConsumption = this.getFuelConsumption();
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public static double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometers) {
        double neededFuel = kilometers * this.fuelConsumption;
        if (neededFuel <= this.fuel) {
            this.fuel -= neededFuel;
        }
    }
}
