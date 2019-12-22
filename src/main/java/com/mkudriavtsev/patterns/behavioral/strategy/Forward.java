package main.java.com.mkudriavtsev.patterns.behavioral.strategy;

public class Forward implements PlayerState {
    @Override
    public void doThis() {
        System.out.println("Forward");
    }
}
