package main.java.com.mkudriavtsev.patterns.structural.bridge;

public class XBoxController implements Joystick {

    @Override
    public void startButton() {
        System.out.println("Xbox start button pressed");
    }

    @Override
    public void leftStickButton() {
        System.out.println("Xbox left stick button pressed");
    }

    @Override
    public void rightStickButton() {
        System.out.println("Xbox right stick button pressed");
    }

    @Override
    public void aButton() {
        System.out.println("Xbox 'A' button pressed");
    }

    @Override
    public void bButton() {
        System.out.println("Xbox 'B' button pressed");
    }
}
