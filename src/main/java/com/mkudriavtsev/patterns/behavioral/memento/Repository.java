package main.java.com.mkudriavtsev.patterns.behavioral.memento;

import java.io.*;
import java.util.Date;

public class Repository {
    Save save;
    public void addSave(Save save) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("src/main/java/com/mkudriavtsev/patterns/behavioral/memento/resources/textEditorSave.txt"))) {
            writer.write(save.getText());

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Save getSave() {
        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(
                new FileReader("src/main/java/com/mkudriavtsev/patterns/behavioral/memento/resources/textEditorSave.txt"))) {
            while (reader.ready()) {
                stringBuffer.append(reader.readLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new Save(stringBuffer.toString());
    }
}
