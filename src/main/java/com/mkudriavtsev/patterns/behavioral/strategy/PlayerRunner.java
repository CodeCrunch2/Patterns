package main.java.com.mkudriavtsev.patterns.behavioral.strategy;

public class PlayerRunner {
    public static void main(String[] args) {
        Player player = new Player();
        player.setPlayerState(new Play());
        player.doThis();
        player.setPlayerState(new Forward());
        player.doThis();
        player.setPlayerState(new Pause());
        player.doThis();

    }
}
