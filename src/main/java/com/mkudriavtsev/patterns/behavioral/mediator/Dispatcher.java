package main.java.com.mkudriavtsev.patterns.behavioral.mediator;

public interface Dispatcher {
    public void sendInformation(String information, Pilot pilot);
}
