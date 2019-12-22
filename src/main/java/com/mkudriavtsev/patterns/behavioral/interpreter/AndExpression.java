package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class AndExpression implements Expression {
    Expression expressionLeft;
    Expression expressionRight;

    public AndExpression(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() {
        return expressionLeft.interpret() & expressionRight.interpret();
    }
}
