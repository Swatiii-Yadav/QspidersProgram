package JavaProgram.oops.abstraction;

abstract class HotStar {
    void login(){
        System.out.println("login success....");
    }
    abstract void watch();
}
class HotStarFree extends HotStar{

    @Override
    void watch() {
        System.out.println("Ad+Trailer");
    }
}
class HotStarVIP extends HotStar{

    @Override
    void watch() {
        System.out.println("Ad+Regional");
    }
}
class HotStarPremium extends HotStar{

    @Override
    void watch() {
        System.out.println("All content Access");
    }
}