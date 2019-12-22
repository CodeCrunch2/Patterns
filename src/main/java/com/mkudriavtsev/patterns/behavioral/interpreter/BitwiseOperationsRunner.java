package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class BitwiseOperationsRunner {
    public static void main(String[] args) {
        String expression = "34&43";
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interpret(evaluator));
    }
}
