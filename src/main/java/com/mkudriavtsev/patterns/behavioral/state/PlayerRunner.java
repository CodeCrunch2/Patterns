package main.java.com.mkudriavtsev.patterns.behavioral.state;

public class PlayerRunner {
    public static void main(String[] args) {
        PlayerState playerState = new Play();
        Player player = new Player();
        player.setPlayerState(playerState);
        for (int i = 0; i < 5; i++) {
            player.doThis();
            player.changeState();
        }
    }
}
