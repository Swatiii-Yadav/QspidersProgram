package oopsPracticeQuestions.february11;

import java.io.File;

abstract class FileSystem {

    abstract void open();

}
     class TextFile extends FileSystem {
        @Override
        void open() {
            System.out.println("Opening text file in Notepad...");
        }
    }

    class AudioFile extends FileSystem {
        @Override
        void open() {
            System.out.println("Playing audio file in media player...");
        }
    }

    class VideoFile extends FileSystem {
        @Override
        void open() {
            System.out.println("Playing video file in VLC player...");
        }
    }

class MainClassForFiles
{
    public static void main(String[] args) {
        FileSystem textFile = new TextFile();
        FileSystem audioFile = new AudioFile();
        FileSystem videoFile = new VideoFile();
        textFile.open();
        audioFile.open();
        videoFile.open();
    }
}