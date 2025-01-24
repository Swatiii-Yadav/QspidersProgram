package JavaProgram.oops.Inheritance;

public class MainClass7 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        System.out.println("Information of Vehicles");

        v1.start();
        v1.stop();
        System.out.println("Average speed of vehicle "+v1.speed);


        Car c1=new Car();
        System.out.println();
        System.out.println("Information of car");
        c1.seat=5;
        System.out.println("No  of seats in  vehicle "+c1.seat);
        c1.start();
        c1.stop();
        c1.NoOfWindow=8;
        System.out.println("No of  window in car "+c1.window());
        c1.FuelType();
        c1.sunRoof();
        System.out.println();


        MotorCycle m1=new MotorCycle();
        System.out.println("Information of MotorCycle");
        m1.start();
        m1.stop();
        System.out.println("Average speed of vehicle "+m1.speed);
        m1.selfStart();


    }

}