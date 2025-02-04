package JavaProgram.oops.downCasting;

/* Media Player with Multiple Media Types
Task Explanation:

Class Hierarchy: Media is the superclass, and Audio and Video are subclasses.
Goal: Given a list of Media objects, you need to identify which objects are Video and
then downcast them to invoke methods like playVideo().
Media Class (Superclass)
--------------------------
The Media class serves as the base class for all media types (both audio and video). It can contain common attributes and methods that are shared across all media types.
Data Members (Instance Variables) for Media:
title: The title or name of the media (e.g., "Song 1", "Movie A").
duration: The duration of the media in seconds (e.g., 240 seconds for a 4-minute media).
A common method play() that can be overridden in subclasses.
A method to display media information.

Data Members for Audio:
---------------------
bitrate: The bitrate of the audio in kilobits per second (e.g., 128 kbps, 320 kbps).
genre: The genre of the audio (e.g., Pop, Rock, Jazz).
Methods:
You can override the play() method to define how to play an audio file.
Add any audio-specific methods such as displayAudioInfo().

Data Members for Video:
----------------------
resolution: The resolution of the video (e.g., "1920x1080").
frameRate: The frame rate of the video (e.g., 30 frames per second).

Methods:
You can override the play() method to define how to play a video file.
Add any video-specific methods such as playVideo() and displayVideoInfo().
Steps:
Loop through the Media objects.
For each object, check if it’s a Video type (use instanceof or similar).
Downcast the Media reference to a Video reference and call the playVideo() method.
Key Concept: Downcasting to a specific type lets you access methods that are unique to that type,
such as playing a video in this case.
 */

public class Media {
    String title;
    double duration;

    Media(String title, double duration) {
        this.duration = duration;
        this.title = title;
    }
 void play(){
     System.out.println("Playing Media: " + title + " of " + duration + "minutes");
 }

}

class Audio extends Media {
int bitRate;
String genre;
    Audio(String title, double duration,int bitRate,String genre) {
        super(title, duration);
        this.bitRate=bitRate;
        this.genre=genre;
    }
    void playMusic(){
        System.out.println("Palying Audio of "+genre+" genre ");
        System.out.println("Audio :" + title + "(" + genre + "), Duration: " + duration + " seconds,Bitrate: " + bitRate + "kbps.");

    }
}

class Video extends Media {
    String resolution;
    int frameSize;
    Video(String title, double duration,String resolution,int frameSize) {
        super(title, duration);
        this.resolution=resolution;
        this.frameSize=frameSize;
    }
    void playVideo(){
        System.out.println("Video : " + title +", Duration:" + duration +" seconds,Resolution: " + resolution + ",Frame size: " + frameSize);

    }
}