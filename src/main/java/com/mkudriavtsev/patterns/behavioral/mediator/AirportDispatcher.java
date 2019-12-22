package main.java.com.mkudriavtsev.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirportDispatcher implements Dispatcher {
    List<Pilot> pilots = new ArrayList<>();
    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    @Override
    public void sendInformation(String information, Pilot pilot) {
        for (Pilot p: pilots) {
            if (p != pilot) {
                p.getInformation(information);
            }

        }
    }
}
