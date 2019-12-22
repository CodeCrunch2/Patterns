package main.java.com.mkudriavtsev.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {
    public static final Map<String, Flower> flowers = new HashMap<>();
    public Flower getFlower(String name) {
        Flower flower = flowers.get(name);
        if (flower == null) {
            switch (name) {
                case "rose":
                    flower = new Rose();
                    break;
                case "gladiolus":
                    flower = new Gladiolus();
                    break;
            }
            flowers.put(name, flower);
        }
        return flower;
    }

}
