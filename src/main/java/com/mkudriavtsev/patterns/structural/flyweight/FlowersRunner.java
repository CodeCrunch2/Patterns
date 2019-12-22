package main.java.com.mkudriavtsev.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlowersRunner {
    public static void main(String[] args) {
        FlowerFactory flowerFactory = new FlowerFactory();
        List<Flower> flowers = new ArrayList<>();
        flowers.add(flowerFactory.getFlower("rose"));
        flowers.add(flowerFactory.getFlower("rose"));
        flowers.add(flowerFactory.getFlower("rose"));
        flowers.add(flowerFactory.getFlower("rose"));
        flowers.add(flowerFactory.getFlower("gladiolus"));
        flowers.add(flowerFactory.getFlower("gladiolus"));
        flowers.add(flowerFactory.getFlower("gladiolus"));
        for (Flower flower: flowers) {
            flower.bloom();
        }


    }


}
