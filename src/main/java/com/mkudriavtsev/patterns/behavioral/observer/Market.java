package main.java.com.mkudriavtsev.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Market implements Observed {
    List<String> goods = new ArrayList<>();
    List<Observer> buyers = new ArrayList<>();

    public void addProduct(String product) {
        goods.add(product);
        notifyObservers();
    }
    public void removeProduct(String product) {
         goods.remove(product);
         notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        buyers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        buyers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: buyers) {
            observer.handleEvent(goods);
        }
    }
}
