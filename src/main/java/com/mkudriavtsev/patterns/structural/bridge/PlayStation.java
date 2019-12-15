package main.java.com.mkudriavtsev.patterns.structural.bridge;

public class PlayStation extends GameConsole {
    public PlayStation(Joystick joystick) {
        super(joystick);
    }

    @Override
    public void playGame() {
        System.out.println("PlayStation console launched the game");
        joystick.startButton();
    }
}
