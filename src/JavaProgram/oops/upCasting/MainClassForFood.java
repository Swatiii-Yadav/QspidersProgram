package JavaProgram.oops.upCasting;

public class MainClassForFood {
    public static void main(String[] args) {
        Biryani b=new Biryani();
        Swiggy.addItem(b);

        MasalaDosa md=new MasalaDosa();
        Swiggy.addItem(md);

        PavBhaji pb=new PavBhaji();
        Swiggy.addItem(pb);
    }
}
