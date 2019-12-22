package main.java.com.mkudriavtsev.patterns.behavioral.strategy;

public class Pause implements PlayerState {
    @Override
    public void doThis() {
        System.out.println("Pause");
    }
}
