package designPatterns.creationalDesignPatten.singleton;

import java.util.ArrayList;
import java.util.List;

interface AmazonLoginSystem {
    void logIn(String userName);

    void logOut(String userName);

    void displayUser();

}

class LoginManager implements AmazonLoginSystem {
    private static AmazonLoginSystem log;
    private static List<String> userNameList;

    public LoginManager() {
        userNameList = new ArrayList<>();
    }

    public static AmazonLoginSystem getLog() {
        if (log == null) {
            log = new LoginManager();
        }
        return log;
    }

    @Override
    public void logIn(String userName) {
        if (!userNameList.contains(userName)) {
            userNameList.add(userName);
            System.out.println(userName + " logged in");

        } else {
            System.out.println(userName + " already logged in ");
        }
    }

    @Override
    public void logOut(String userName) {
        if (userNameList.contains(userName)) {
            userNameList.remove(userName);
            System.out.println(userName + " logged out Successfully");

        } else {
            System.out.println(userName + " Never logged in ");
        }
    }

    @Override
    public void displayUser() {
        System.out.println("currently logged in user: "+userNameList);
    }
}