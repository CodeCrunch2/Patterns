package main.java.com.mkudriavtsev.patterns.behavioral.chain;

public class BotSupport extends Support{
    public BotSupport(int level) {
        super(level);
    }

    @Override
    public void write(String problem) {
        System.out.println("Bot solves the problem: " + problem);
    }
}
