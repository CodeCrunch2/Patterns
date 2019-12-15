package main.java.com.mkudriavtsev.patterns.creational.builder;

public class Director {
    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildManufacturer();
        builder.buildModel();
        builder.buildEngineVolume();
        builder.buildTransmission();
        Car car = builder.getCar();
        return car;
    }

}
