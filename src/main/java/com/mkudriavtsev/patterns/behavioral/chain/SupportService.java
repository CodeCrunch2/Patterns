package main.java.com.mkudriavtsev.patterns.behavioral.chain;

public class SupportService {
    public static void main(String[] args) {
        Support support = new BotSupport(Level.EASY);
        Support operatorSupport = new OperatorSupport(Level.MEDIUM);
        Support specialistSupport = new SpecialistSupport(Level.HARD);
        support.setNextSupport(operatorSupport);
        operatorSupport.setNextSupport(specialistSupport);
        support.supportManager("Not enough disk space", Level.EASY);
        support.supportManager("The computer does not turn on", Level.MEDIUM);
        support.supportManager("Blue screen of death", Level.HARD);

    }
}
