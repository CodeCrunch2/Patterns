package main.java.com.mkudriavtsev.patterns.behavioral.chain;

public class OperatorSupport extends Support {

    public OperatorSupport(int level) {
        super(level);
    }

    @Override
    public void write(String problem) {
        System.out.println("Operator solves the problem: " + problem);
    }
}
