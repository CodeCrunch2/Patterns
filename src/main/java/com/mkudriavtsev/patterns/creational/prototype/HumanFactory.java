package main.java.com.mkudriavtsev.patterns.creational.prototype;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    Human cloneHuman() {
        return (Human)human.copy();
    }
}
