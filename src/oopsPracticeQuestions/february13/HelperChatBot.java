package oopsPracticeQuestions.february13;

public class HelperChatBot {
    static void getMessage(ChatBot bot){
        if (bot!=null){
            System.out.println("Get message "+bot.message());
        }
    }
    static void GetResponse(ChatBot bot){
        if (bot!=null){
            System.out.println("Get response "+bot.response());
        }
    }
    static void getDetails(ChatBot bot){
        if (bot!=null){
            System.out.println(bot.getBotType());
        }
    }
}
