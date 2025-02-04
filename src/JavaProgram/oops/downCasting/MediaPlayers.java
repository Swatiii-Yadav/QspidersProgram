package JavaProgram.oops.downCasting;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayers {
    List<Media> list = new ArrayList<>();

    void  addMedia(Media media) {
        list.add(media);
    }

    void MediaInfo() {
        for (Media media : list) {
            if (media != null) {

                if (media instanceof Audio) {
                    Audio a1 = (Audio) media;
                    a1.playMusic();
                } else if (media instanceof Video) {
                    Video v1 = (Video) media;
                   v1.playVideo();

                }
                else if (media instanceof Media){
                    media.play();
                }

                System.out.println("Title: " + media.title );
            }
        }
    }
}
