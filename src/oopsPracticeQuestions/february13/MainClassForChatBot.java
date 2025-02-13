package oopsPracticeQuestions.february13;

import java.util.Scanner;

public class MainClassForChatBot {
    public static void main(String[] args) {
        SalesBot salesBot = new SalesBot();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter context (Product Recommendation / Promotion / Other): ");
        String userContext = sc.nextLine();
        HelperChatBot.getMessage(new SalesBot());
        HelperChatBot.GetResponse(new SalesBot());
        HelperChatBot.getDetails(new SalesBot());
    }
}
