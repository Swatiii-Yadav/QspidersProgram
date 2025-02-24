package designPatterns.creationalDesignPatten.singleton;

public class MainClassForAIChatBot{
    public static void main(String[] args) {
        AIChatbot ai= AIChatbot.getBotSession();
        ai.reply("how can i help");

    }
}
