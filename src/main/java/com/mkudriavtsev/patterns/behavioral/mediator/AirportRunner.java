package main.java.com.mkudriavtsev.patterns.behavioral.mediator;

public class AirportRunner {
    public static void main(String[] args) {
        AirportDispatcher airportDispatcher = new AirportDispatcher();
        Pilot pilot1 = new AirplanePilot(airportDispatcher, "Pilot 1");
        Pilot pilot2 = new AirplanePilot(airportDispatcher, "Pilot 2");
        Pilot pilot3 = new AirplanePilot(airportDispatcher, "Pilot 3");
        airportDispatcher.addPilot(pilot1);
        airportDispatcher.addPilot(pilot2);
        airportDispatcher.addPilot(pilot3);
        pilot1.sendInformation("Pilot 1 coordinates: 59.951524, 30.038917");

    }
}
