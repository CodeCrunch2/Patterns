package main.java.com.mkudriavtsev.patterns.behavioral.state;

public class Forward implements PlayerState {
    @Override
    public void doThis() {
        System.out.println("Forward");
    }
}
