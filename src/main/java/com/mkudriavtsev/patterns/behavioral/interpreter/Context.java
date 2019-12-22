package main.java.com.mkudriavtsev.patterns.behavioral.interpreter;

public class Context {
    public Expression evaluate(String s){
        int pos = s.length() - 1;
        while (pos > 0){
            if(Character.isDigit(s.charAt(pos))){
                pos--;
            }else{
                Expression left = evaluate(s.substring(0,pos));
                Expression right = new NumberExpression(Integer.parseInt(s.substring(pos + 1, s .length())));
                char operation = s.charAt(pos);
                switch (operation){
                    case '&':
                        return new AndExpression(left, right);
                    case '|':
                        return new OrExpression(left,right);
                    case '^':
                        return new XORExpression(left,right);
                }
            }
        }
        int result = Integer.parseInt(s);
        return new NumberExpression(result);
    }
}
