package oopsPracticeQuestions.february13;

import java.util.Scanner;

abstract class ChatBot {
     String context;
     abstract String  message();
    abstract String response();
    abstract  String  getBotType();
    void setContext(String context){
       this.context=context;
    }

}
class SalesBot extends ChatBot{
String msg;
    Scanner sc=new Scanner(System.in);
SalesBot(){
    this.msg=sc.nextLine();
}
    @Override
    String  message() {
        return this.msg;
    }

    @Override
    String response() {
        return switch (context) {
            case "Product recommendation " -> "show products";
            case "promotion" -> "todays latest product are ..........";
            default -> "how can i help you ?? ";
        };

    }

    @Override
    String getBotType() {
        return "SalesBot";
    }
}
