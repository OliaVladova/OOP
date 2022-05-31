package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class BaseVehicle implements Vehicle {
    //fuel quantity, fuel consumption in liters per km
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected BaseVehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            this.fuelQuantity = fuelQuantity;
        }
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption += fuelConsumption;
    }

    public void drive(double distance) {
        if (distance * this.fuelConsumption < this.fuelQuantity) {
            DecimalFormat decimalFormat = new DecimalFormat("####.##");
            if (this instanceof Car) {
                System.out.printf("Car travelled %s km\n", decimalFormat.format(distance));
            } else if (this instanceof Truck) {
                System.out.printf("Truck travelled %s km\n", decimalFormat.format(distance));
            } else if (this instanceof Bus) {
                System.out.printf("Bus travelled %s km\n", decimalFormat.format(distance));
            }
            this.fuelQuantity -= distance * this.fuelConsumption;
        } else {
            if (this instanceof Car) {
                System.out.println("Car needs refueling");
            } else if (this instanceof Truck) {
                System.out.println("Truck needs refueling");
            } else if (this instanceof Bus) {
                System.out.println("Bus needs refueling");
            }
        }
    }

    public void refuel(double litres) {
        if (litres <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (litres + this.fuelQuantity <= this.tankCapacity) {
            if (this instanceof Car) {
                this.fuelQuantity += litres;
            } else if (this instanceof Truck) {
                this.fuelQuantity += litres * 0.95;
            } else if (this instanceof Bus) {
                this.fuelQuantity += litres;
            }
        } else {
            System.out.println("Cannot fit fuel in tank");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getSimpleName()).append(": ").append(String.format("%.2f", this.fuelQuantity));
        return builder.toString();
    }
}
