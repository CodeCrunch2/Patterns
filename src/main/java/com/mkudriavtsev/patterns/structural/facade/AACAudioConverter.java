package main.java.com.mkudriavtsev.patterns.structural.facade;

public class AACAudioConverter {
    public AudioFile convert(AudioFile audioFile) {
        System.out.println("Сonvert to AAC format");
        return audioFile;
    }
}
