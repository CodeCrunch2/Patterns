package main.java.com.mkudriavtsev.patterns.creational.builder;

public class Car {
    private String manufacturer;
    private String model;
    private double engineVolume;
    private Transmission transmission;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", transmission=" + transmission +
                '}';
    }
}
