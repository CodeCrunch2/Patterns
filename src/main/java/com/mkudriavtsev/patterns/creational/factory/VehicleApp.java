package main.java.com.mkudriavtsev.patterns.creational.factory;

public class VehicleApp {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = createVehicleFactoryByType("train");
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.ride();
    }

    static VehicleFactory createVehicleFactoryByType(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new CarFactory();
        }
        else if (type.equalsIgnoreCase("train")) {
            return new TrainFactory();
        }
        else if (type.equalsIgnoreCase("bicycle")) {
            return new BicycleFactory();
        }
        else throw new RuntimeException("unknown type");

    }
}
