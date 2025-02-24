package designPatterns.creationalDesignPatten.singleton;

public class AIChatbot
{
    private static AIChatbot botSession;
    private AIChatbot(){}

    public static AIChatbot getBotSession(){
        if (botSession==null){
            botSession=new AIChatbot();
        }
        return botSession;
    }
    public  void reply(String msg){
        System.out.println("Bot reply : "+msg);
    }
}
