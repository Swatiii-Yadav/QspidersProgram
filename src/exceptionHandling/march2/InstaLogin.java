package exceptionHandling.march2;

//A user logs into a social media app. If username or password is incorrect, throw an error.
class InValidUserId extends Exception {
    InValidUserId(String msg) {
        super(msg);
    }
}


class InValidPassWord extends Exception {
    InValidPassWord(String msg) {
        super(msg);
    }
}


public class InstaLogin {
    String userID;
    String password;

    InstaLogin(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    void getUserId(String id) throws InValidUserId {
        if (!userID.equals(id)) {
            throw new InValidUserId("Wrong user id ");
        }
        System.out.println("Successfully login");
    }

    void getPassWord(String pass) throws InValidPassWord {
        if (!password.equals(pass)) {
            throw new InValidPassWord("InValid Password");
        }
        System.out.println("Successfully login");
    }
}

class MainClassForInstaLogin {
    public static void main(String[] args) {
        InstaLogin login = new InstaLogin("Swati@05", "12345");
        try {
            login.getUserId("Swati@05");
            login.getPassWord("12345");
        } catch (InValidUserId e) {
            System.out.println(e.getMessage());
        } catch (InValidPassWord e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
