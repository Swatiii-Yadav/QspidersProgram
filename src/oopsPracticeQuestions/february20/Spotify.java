package oopsPracticeQuestions.february20;

import java.util.LinkedList;
import java.util.Queue;

interface Spotify {
    boolean play();
    boolean pause();
    Queue<String> songs();
    void isSubscribed();
}


class Subscription implements Spotify{
boolean subscription=false;
boolean playSong=false;
Queue<String> listOfSongs=new LinkedList<>();

    @Override
    public boolean play() {
        if (!playSong){
            playSong=true;
            System.out.println("music is playing");
            return true;
        }
        return false;

    }

    @Override
    public boolean pause() {
        if (playSong){
            playSong=false;
            System.out.println("music paused");
            return true;
        }
        return false;
    }

    @Override
    public Queue<String> songs() {
        return this.listOfSongs;
    }

    @Override
    public void isSubscribed() {
        if (subscription){
            System.out.println("Unlimited songs without ads");
        }
        else {
            System.out.println("limited songs with adds");
        }

    }


}
