package main.java.com.mkudriavtsev.patterns.behavioral.observer;

import java.util.List;

public class Buyer implements Observer {
    String name;

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> goods) {
        System.out.println(name + ", see our product range:\n" + goods +
                "\n==============================================\n");
    }
}
