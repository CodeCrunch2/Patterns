package main.java.com.mkudriavtsev.patterns.behavioral.state;

public class Play implements PlayerState {
    @Override
    public void doThis() {
        System.out.println("Playing music");
    }
}
