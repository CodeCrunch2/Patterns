package main.java.com.mkudriavtsev.patterns.structural.facade;

public class MP3AudioConverter {
    public AudioFile convert(AudioFile audioFile) {
        System.out.println("Convert to mp3 format");
        return audioFile;
    }
}
