package main.java.com.mkudriavtsev.patterns.behavioral.template;

public abstract class EnemyTemplate {
    public void attack() {
        System.out.println("Ready to attack");
        attackAction();
        System.out.println("Retreating");
    }
    public abstract void attackAction();
}
