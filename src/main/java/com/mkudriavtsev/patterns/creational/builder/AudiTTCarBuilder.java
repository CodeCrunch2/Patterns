package main.java.com.mkudriavtsev.patterns.creational.builder;

public class AudiTTCarBuilder extends CarBuilder {
    @Override
    void buildManufacturer() {
        car.setManufacturer("Audi");
    }

    @Override
    void buildModel() {
        car.setModel("TT");
    }

    @Override
    void buildEngineVolume() {
        car.setEngineVolume(2.0);
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTOMATIC);
    }
}
