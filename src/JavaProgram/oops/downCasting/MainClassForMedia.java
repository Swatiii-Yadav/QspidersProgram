package JavaProgram.oops.downCasting;

public class MainClassForMedia {
    public static void main(String[] args) {
        MediaPlayers md = new MediaPlayers();




        Audio a1 = new Audio("Song 1", 5.1, 320, "Rock");
        Video v1 = new Video("Movie A", 1200, "1920x1080", 30);
        Audio a2 = new Audio("Song 2", 3.7, 220, "romantic");
        Video v2 = new Video("Movie B", 1200, "1920x1080", 30);
        Audio a3 = new Audio("Song 3", 4.05, 400, "party");
        Video v3 = new Video("Movie C", 1200, "1920x1080", 30);

        md.addMedia(a1);
        md.addMedia(v1);

        md.addMedia(a2);
        md.addMedia(v2);

        md.addMedia(a3);
        md.addMedia(v3);

        System.out.println("Media Player Info:");
       md.MediaInfo();
    }
}
