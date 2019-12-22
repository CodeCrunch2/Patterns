package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class Evaluate implements Expression {
    Expression evaluate;
    public Evaluate(String expression) {

    }

    @Override
    public int interpret(Expression context) {
        return evaluate.interpret(context);
    }
}
