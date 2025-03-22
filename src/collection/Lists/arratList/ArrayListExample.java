package collection.Lists.arratList;


import java.util.ArrayList;

public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();

            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");


            System.out.println("First Element: " + list.get(0));


            list.set(1, "Blueberry");


            list.remove("Cherry");

            System.out.println("Final List:");
            for (String fruit : list) {
                System.out.println(fruit);
            }
        }
    }


