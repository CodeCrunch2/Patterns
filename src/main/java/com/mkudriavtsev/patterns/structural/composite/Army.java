package main.java.com.mkudriavtsev.patterns.structural.composite;

public class Army {
    public static void main(String[] args) {
        SeniorOfficers seniorOfficers = new SeniorOfficers();
        SeniorOfficer major = new Major();
        SeniorOfficer lieutenantColonel = new LieutenantСolonel();
        SeniorOfficer colonel = new Colonel();

        seniorOfficers.addSeniorOfficer(major);
        seniorOfficers.addSeniorOfficer(lieutenantColonel);
        seniorOfficers.addSeniorOfficer(colonel);

        seniorOfficers.serveInArmy();
    }
}
