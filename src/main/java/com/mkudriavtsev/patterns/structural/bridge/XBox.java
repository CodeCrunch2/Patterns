package main.java.com.mkudriavtsev.patterns.structural.bridge;

public class XBox extends GameConsole {
    public XBox(Joystick joystick) {
        super(joystick);
    }

    @Override
    public void playGame() {
        System.out.println("Xbox console launched the game");
        joystick.startButton();
    }
}
