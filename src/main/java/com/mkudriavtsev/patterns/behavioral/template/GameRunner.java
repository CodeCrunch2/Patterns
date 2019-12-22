package main.java.com.mkudriavtsev.patterns.behavioral.template;

public class GameRunner {
    public static void main(String[] args) {
        EnemyTemplate headCrab = new HeadCrab();
        EnemyTemplate allianceWarrior = new AllianceWarrior();

        headCrab.attack();
        System.out.println("\n-------------------------------------\n");
        allianceWarrior.attack();
    }
}
