package oopsPracticeQuestions.february20;

public class ManageSpotify
{
    static void play(Spotify song){
        if (song!=null){
            song.play();
        }
    }
    static void pause(Spotify song){
        if (song!=null){
            song.pause();
        }
    }
    static void Songs(Spotify song){
        if (song!=null){
            System.out.println( song.songs());
        }
    }

    static void Subscriber(Spotify song){
        if (song!=null){
            song.isSubscribed();
        }
    }

}
