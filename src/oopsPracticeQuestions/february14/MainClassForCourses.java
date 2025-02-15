package oopsPracticeQuestions.february14;

import java.util.Scanner;

public class MainClassForCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a Course Type: Video, Article, Live");
        String courseType = scanner.nextLine().toLowerCase();

        ELearning courseService;

        switch (courseType) {
            case "video":
                VideoClass videoCourse = new VideoClass( 2.5, "java core","https:video-url.com/java-basics");
                courseService = new VideoClassDetails(videoCourse);
                break;

            case "article":
                ArticleCourses articleCourse = new ArticleCourses( 1.5,"OOP Concepts", "OOP is a programming paradigm...");
                courseService = new ArticleCoursesDetails(articleCourse);
                break;

            case "live":
                LiveClass liveClass = new LiveClass( 3.0,"Advanced Java", "https://live-class-url.com/advanced-java");
                courseService = new LiveCourseDetail(liveClass);
                break;

            default:
                System.out.println("Invalid");
                return;
        }

        courseService.content();
        courseService.enroll();


    }
}
