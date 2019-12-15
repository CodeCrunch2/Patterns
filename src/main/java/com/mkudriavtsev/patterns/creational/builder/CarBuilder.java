package main.java.com.mkudriavtsev.patterns.creational.builder;

public abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }
    abstract void buildManufacturer();
    abstract void buildModel();
    abstract void buildEngineVolume();
    abstract void buildTransmission();

    Car getCar() {
        return car;
    }


}
