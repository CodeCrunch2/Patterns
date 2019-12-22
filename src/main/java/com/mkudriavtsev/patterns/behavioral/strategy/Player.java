package main.java.com.mkudriavtsev.patterns.behavioral.strategy;

public class Player {
    PlayerState playerState;

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public void doThis(){
        playerState.doThis();
    }
}
