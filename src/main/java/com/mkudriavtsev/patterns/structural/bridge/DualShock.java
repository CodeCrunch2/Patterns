package main.java.com.mkudriavtsev.patterns.structural.bridge;

public class DualShock implements Joystick {
    @Override
    public void startButton() {
        System.out.println("Dualshock start button pressed");
    }

    @Override
    public void leftStickButton() {
        System.out.println("Dualshock left stick button pressed");
    }

    @Override
    public void rightStickButton() {
        System.out.println("Dualshock right stick button pressed");
    }

    @Override
    public void aButton() {
        System.out.println("Dualshock 'A' button pressed");
    }

    @Override
    public void bButton() {
        System.out.println("Dualshock 'B' button pressed");
    }
}
