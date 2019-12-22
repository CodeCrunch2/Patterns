package main.java.com.mkudriavtsev.patterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String text;

    public Save(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
