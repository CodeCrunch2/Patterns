package main.java.com.mkudriavtsev.patterns.behavioral.strategy;

public class Play implements PlayerState {
    @Override
    public void doThis() {
        System.out.println("Playing music");
    }
}
