package oopsPracticeQuestions.february14;

public interface ELearning {
    void content();
    void enroll();
}
class VideoClassDetails implements  ELearning{
VideoClass videoClass;
VideoClassDetails(VideoClass videoClass){
    this.videoClass=videoClass;
}
    @Override
    public void content() {
        System.out.println("Displaying Video Course: " + videoClass.getTitle());
        videoClass.content();
    }

    @Override
    public void enroll() {
        videoClass.enroll();
    }
}
class ArticleCoursesDetails implements  ELearning{
    ArticleCourses articleCourses;
    ArticleCoursesDetails(ArticleCourses articleCourses){
        this.articleCourses=articleCourses;
    }
    @Override
    public void content() {
        System.out.println("Displaying Video Course: " + articleCourses.getTitle());
        articleCourses.content();
    }

    @Override
    public void enroll() {
        articleCourses.enroll();
    }
}
class LiveCourseDetail implements  ELearning{
    LiveClass liveClass;
    LiveCourseDetail(LiveClass liveClass){
        this.liveClass=liveClass;
    }
    @Override
    public void content() {
        System.out.println("Displaying Video Course: " + liveClass.getTitle());
        liveClass.content();
    }

    @Override
    public void enroll() {
        liveClass.enroll();
    }
}
