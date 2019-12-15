package main.java.com.mkudriavtsev.patterns.creational.builder;

public class Gaz24CarBuilder extends CarBuilder {
    @Override
    void buildManufacturer() {
        car.setManufacturer("GAZ");
    }

    @Override
    void buildModel() {
        car.setModel("24");
    }

    @Override
    void buildEngineVolume() {
        car.setEngineVolume(5.5);
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }
}
