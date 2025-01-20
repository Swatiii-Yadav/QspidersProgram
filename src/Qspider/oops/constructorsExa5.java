package Qspider.oops;

class Container{
    int capacity;
    Container(int arg){
        capacity=arg;
    }
}

public class constructorsExa5 {

    public static void main(String[] args) {
     Container c1=new Container(80);
        System.out.println(c1.capacity);
        Container c2=new Container(90);
        System.out.println(c2.capacity);
        Container c3=new Container(60);
        System.out.println(c3.capacity);
        Container c4=new Container(139);
        System.out.println(c4.capacity);
    }
}
