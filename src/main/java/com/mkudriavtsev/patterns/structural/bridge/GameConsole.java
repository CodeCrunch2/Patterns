package main.java.com.mkudriavtsev.patterns.structural.bridge;

public abstract class GameConsole {
    protected Joystick joystick;

    public GameConsole(Joystick joystick) {
        this.joystick = joystick;
    }

    public abstract void playGame();
}
