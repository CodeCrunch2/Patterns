package main.java.com.mkudriavtsev.patterns.creational.singleton;

public class Enemy {
    private String name;
    private int shootDamage;

    public Enemy(String name, int shootDamage) {
        this.name = name;
        this.shootDamage = shootDamage;
    }

    public String getName() {
        return name;
    }

    public int getShootDamage() {
        return shootDamage;
    }

}
