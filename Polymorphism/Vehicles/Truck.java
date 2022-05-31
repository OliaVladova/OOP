package Polymorphism.Vehicles;

public class Truck extends BaseVehicle {
    private double FUElCONSUMPTION = 1.6;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
        super.setFuelConsumption(FUElCONSUMPTION);
    }

}
