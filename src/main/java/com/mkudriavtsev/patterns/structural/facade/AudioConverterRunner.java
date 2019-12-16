package main.java.com.mkudriavtsev.patterns.structural.facade;

public class AudioConverterRunner {
    public static void main(String[] args) {
        AudioConverter audioConverter = new AudioConverter();
        audioConverter.convert("Audio1.mp3", "aac");
    }
}
