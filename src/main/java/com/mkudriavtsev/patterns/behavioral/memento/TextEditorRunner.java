package main.java.com.mkudriavtsev.patterns.behavioral.memento;

public class TextEditorRunner {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Repository repository = new Repository();
        textEditor.enterText("This is content");
        System.out.println(textEditor.getText());
        repository.addSave(textEditor.save());
        textEditor.load(repository.getSave());
        System.out.println(textEditor.getText());
    }
}
