package main.java.com.mkudriavtsev.patterns.behavioral.chain;

public class SpecialistSupport extends Support {
    public SpecialistSupport(int level) {
        super(level);
    }

    @Override
    public void write(String problem) {
        System.out.println("Specialist solves the problem: " + problem);
    }
}
