package main.java.com.mkudriavtsev.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class SeniorOfficers {
    private List<SeniorOfficer> seniorOfficers = new ArrayList<>();
    public void addSeniorOfficer(SeniorOfficer seniorOfficer) {
        seniorOfficers.add(seniorOfficer);
    }
    public void serveInArmy() {
        for (SeniorOfficer seniorOfficer: seniorOfficers) {
            seniorOfficer.serve();
        }
    }
}
