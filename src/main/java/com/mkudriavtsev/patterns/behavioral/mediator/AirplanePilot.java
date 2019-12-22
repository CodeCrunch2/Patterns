package main.java.com.mkudriavtsev.patterns.behavioral.mediator;

public class AirplanePilot implements Pilot {
    Dispatcher dispatcher;
    String name;

    public AirplanePilot(Dispatcher dispatcher, String name) {
        this.dispatcher = dispatcher;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendInformation(String information) {
        dispatcher.sendInformation(information, this);

    }

    @Override
    public void getInformation(String information) {
        System.out.println(this.name + " receiving information: " + information);
    }
}
