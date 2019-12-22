package main.java.com.mkudriavtsev.patterns.behavioral.template;

public class HeadCrab extends EnemyTemplate {
    @Override
    public void attackAction() {
        System.out.println("Jump on the head");
    }
}
