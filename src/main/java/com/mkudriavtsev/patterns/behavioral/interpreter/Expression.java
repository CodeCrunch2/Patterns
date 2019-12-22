package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public interface Expression {
    public int interpret(Expression context);
}
