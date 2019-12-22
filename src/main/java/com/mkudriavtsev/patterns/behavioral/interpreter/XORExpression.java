package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class XORExpression implements Expression {
    Expression expressionLeft;
    Expression expressionRight;

    public XORExpression(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() {
        return expressionLeft.interpret() ^ expressionRight.interpret();
    }
}
