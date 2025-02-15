package oopsPracticeQuestions.february14;

/* E-Learning Platform
Design an e-learning platform with a base class Course.
Inherit classes for VideoCourse, ArticleCourse, and LiveClass.
Implement polymorphism for displaying different content types.

* */
abstract class Courses {
    double duration;
    String title;

    Courses(double duration, String title) {
        this.title = title;
        this.duration = duration;

    }

    abstract void content();

    double getDuration() {
        return duration;
    }

    String getTitle() {
        return title;
    }

    void enroll() {
        System.out.println("Enrolled in " + title + " for  " + duration);
    }
}

class VideoClass extends Courses {
    String videoURL;

    VideoClass(double duration, String title, String videoURL) {
        super(duration, title);
        this.videoURL = videoURL;
    }

    @Override
    void content() {
        System.out.println("Playing video " + videoURL);
        playVideo();
    }

    public void playVideo() {
        System.out.println("Video is playing...");
    }

    public void pauseVideo() {
        System.out.println("Video is paused.");
    }

    public void skipTo(int time) {
        System.out.println("Skipped to: " + time + " minutes.");
    }
}
    class ArticleCourses extends Courses {
        private String article;

        ArticleCourses(double duration, String title,String article) {
            super(duration, title);
            this.article=article;
        }

        @Override
        void content() {
            System.out.println(article);
        }
        public void readArticle() {
            System.out.println("Reading  ......");
        }

    }

     class LiveClass extends Courses {
        private String liveLink;

        LiveClass(double duration, String title,String liveLink) {
            super(duration, title);
            this.liveLink=liveLink;
        }

        @Override
        void content() {
            System.out.println("Live class "+liveLink);

            joinLiveSession();
        }
        public void joinLiveSession() {
            System.out.println("You have joined the live session.");
        }
        public void EndLiveSession() {
            System.out.println("You have End the live session.");
        }

}