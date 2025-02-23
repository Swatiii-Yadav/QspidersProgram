package designPatterns.creationalDesignPatten.singleton;

public class MainClassForAmazon {
    public static void main(String[] args) {
       AmazonLoginSystem  loginService = LoginManager.getLog();

        loginService.logIn("Swati");
        loginService.logIn("Kalu");
        loginService.logIn("Swati");
        loginService.displayUser();
        loginService.logOut("Swati");


    }
}
