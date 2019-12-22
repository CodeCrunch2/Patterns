package main.java.com.mkudriavtsev.patterns.behavioral.template;

public class AllianceWarrior extends EnemyTemplate {
    @Override
    public void attackAction() {
        System.out.println("Shoots from a blaster");
    }
}
