package oopsPracticeQuestions.february20;

import java.util.Queue;
import java.util.Scanner;

public class MainClassForSpotify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("play?");
        boolean on = sc.nextBoolean();
        Subscription subscriber = new Subscription();
        if (on) {
            ManageSpotify.play(subscriber);
            System.out.println("Play");
        } else {
            ManageSpotify.pause(subscriber);
            System.out.println("pause");
        }
        Queue<String> list = subscriber.listOfSongs;
        list.add("perfect");
        list.add("you and i");
        list.add("tum tak ");
        list.add("tum se");
        list.add("tum ho ");
        list.add("tum tum ");
        list.add("you you");
        list.add("i");

        ManageSpotify.Songs(subscriber);
        boolean subscribe = true;
        ManageSpotify.Subscriber(subscriber);


    }
}
