package Polymorphism.Vehicles;

public class Car extends BaseVehicle {
    private double FUElCONSUMPTION = 0.9;
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
        super.setFuelConsumption(FUElCONSUMPTION);
    }

}
