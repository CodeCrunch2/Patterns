package main.java.com.mkudriavtsev.patterns.creational.singleton;

public enum MainHero {
    GORDON_FREEMAN;
    int health = 100;

    public synchronized int getHealth() {
        return health;
    }

    public synchronized void damage(Enemy enemy) {
        health -= enemy.getShootDamage();
    }
}
