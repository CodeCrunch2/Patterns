package main.java.com.mkudriavtsev.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class BuildCarRunner {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Director director = new Director();
        director.setBuilder(new AudiTTCarBuilder());
        cars.add(director.buildCar());
        director.setBuilder(new Gaz24CarBuilder());
        cars.add(director.buildCar());
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
