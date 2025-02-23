package designPatterns.BehavioralDesignPattern.ObserverDP;

interface NotificationUpdate {
    void update();
}

class NotifyViaEmail implements NotificationUpdate {
    String emailId;

    NotifyViaEmail(String emailId) {
    this.emailId=emailId;
    }

    @Override
    public void update() {
        System.out.println(emailId + " Product in stock.");
    }
}

class NotifyViaMessage implements NotificationUpdate {
    String userName;

    public NotifyViaMessage(String userName) {
        this.userName = userName;
    }

    @Override
    public void update() {
        System.out.println(userName + " Product in stock.");
    }
}