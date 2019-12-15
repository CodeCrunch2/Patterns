package main.java.com.mkudriavtsev.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class BrigdeRunner {
    public static void main(String[] args) {
        List<GameConsole> gameConsoleList = new ArrayList<>();
        gameConsoleList.add(new PlayStation(new DualShock()));
        gameConsoleList.add(new XBox(new XBoxController()));
        for (GameConsole gameConsole: gameConsoleList) {
            gameConsole.playGame();
        }
    }
}
