package JavaProgram.oops.polymorphism;

public class Card {
    void swipe(){
        System.out.println("please wait");
    }
}
 class  DebitCard extends Card {
    @Override
    void swipe(){
        System.out.println("Balance is decreased");

    }
}

class  CreditCard extends Card {
    @Override
    void swipe(){
        System.out.println("Balance(due) is increased");
    }
}
