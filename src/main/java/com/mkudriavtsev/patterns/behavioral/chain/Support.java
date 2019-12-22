package main.java.com.mkudriavtsev.patterns.behavioral.chain;

public abstract class Support {
    private int level;
    private Support nextSupport;

    public Support(int level) {
        this.level = level;
    }

    public void setNextSupport(Support nextSupport) {
        this.nextSupport = nextSupport;
    }

    public void supportManager (String problem, int level) {
        if (level >= this.level) {
            write(problem);
        }
        if (nextSupport != null) {
            nextSupport.supportManager(problem, level);
        }
    }
    public abstract void write (String problem);
}
