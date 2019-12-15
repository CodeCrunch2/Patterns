package main.java.com.mkudriavtsev.patterns.creational.factory;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
