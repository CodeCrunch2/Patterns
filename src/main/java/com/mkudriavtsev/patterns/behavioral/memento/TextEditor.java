package main.java.com.mkudriavtsev.patterns.behavioral.memento;

import java.util.Date;

public class TextEditor {
    private String text;

    public Save save() {
        return new Save(text);
    }
    public void load(Save save) {
        text = save.getText();
    }

    public void enterText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
