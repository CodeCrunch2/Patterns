package main.java.com.mkudriavtsev.patterns.behavioral.state;

public class Pause implements PlayerState {
    @Override
    public void doThis() {
        System.out.println("Pause");
    }
}
