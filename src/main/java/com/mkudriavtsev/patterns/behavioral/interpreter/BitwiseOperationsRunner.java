package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class BitwiseOperationsRunner {
    public static void main(String[] args) {
        String s = "2|5";
        Context context = new Context();
        Expression expression = context.evaluate(s);
        System.out.println(expression.interpret());

    }
}
