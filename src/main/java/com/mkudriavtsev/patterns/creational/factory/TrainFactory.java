package main.java.com.mkudriavtsev.patterns.creational.factory;

public class TrainFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Train();
    }
}
