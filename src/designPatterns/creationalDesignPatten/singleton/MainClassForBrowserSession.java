package designPatterns.creationalDesignPatten.singleton;

public class MainClassForBrowserSession {
    public static void main(String[] args) {
       BrowserSession bs=BrowserSession.getSession();
       bs.setEmail("Swarthi05@gmail.com");
        System.out.println(bs.getEmail());
    }
}
