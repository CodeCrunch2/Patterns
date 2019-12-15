package main.java.com.mkudriavtsev.patterns.creational.factory;

public class BicycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
