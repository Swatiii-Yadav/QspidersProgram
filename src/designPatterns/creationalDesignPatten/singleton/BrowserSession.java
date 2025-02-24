package designPatterns.creationalDesignPatten.singleton;


//Problem: Web browsers maintain one session per user to store cookies, authentication tokens, and user preferences.
//Example: Chrome, Firefox store a single session instance for each logged-in user.
public class BrowserSession {
    private static String email;
    private static BrowserSession session;
     private BrowserSession(){}

   public static BrowserSession getSession(){
         if (session==null){
             session=new BrowserSession();
         }
         return session;
    }
   void setEmail(String email){
          this.email=email;
   }
   String getEmail(){
         return email;
   }
}
