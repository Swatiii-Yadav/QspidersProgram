package collection.InnerClass;

public class Demo1 {
    static class Sample1{   //static inner class

    }
    class Alpha{ //Non-Static inner class

    }
    void help(){
        class Beta{ //local  inner class

        }
        Comparable com=new Comparable() {//Anonymous inner class
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
