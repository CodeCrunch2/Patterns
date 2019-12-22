package main.java.com.mkudriavtsev.patterns.behavioral.state;

public class Player {
    PlayerState playerState;

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }
    public void changeState() {
        if(playerState instanceof Play) {
            setPlayerState(new Forward());
        } else if (playerState instanceof Forward) {
            setPlayerState(new Pause());
        } else if (playerState instanceof Pause) {
            setPlayerState(new Play());
        }
    }
    public void doThis(){
        playerState.doThis();
    }
}
