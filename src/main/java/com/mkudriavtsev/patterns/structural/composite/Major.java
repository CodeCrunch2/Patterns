package main.java.com.mkudriavtsev.patterns.structural.composite;

public class Major implements SeniorOfficer {

    @Override
    public void serve() {
        System.out.println("Будет исполнено!");
    }
}
