package main.java.com.mkudriavtsev.patterns.structural.facade;

public class AudioFile {
    private String name;

    public AudioFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
