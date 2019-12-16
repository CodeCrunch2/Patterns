package main.java.com.mkudriavtsev.patterns.structural.facade;

public class AudioConverter {
    private AudioFile resultFile;
    AudioFile convert(String sourseFileName, String format) {
        AudioFile sourceFile = new AudioFile(sourseFileName);
        if (format.equalsIgnoreCase("mp3")) {
            MP3AudioConverter mp3AudioConverter = new MP3AudioConverter();
            resultFile = mp3AudioConverter.convert(sourceFile);
        }
        else if (format.equalsIgnoreCase("aac")) {
            AACAudioConverter aacAudioConverter = new AACAudioConverter();
            resultFile = aacAudioConverter.convert(sourceFile);
        }
        return resultFile;

    }

}
