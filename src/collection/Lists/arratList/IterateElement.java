package collection.Lists.arratList;

import java.util.ArrayList;

public class IterateElement {
        public static void main(String[] args) {
            ArrayList<String> countries = new ArrayList<>();
            countries.add("USA");
            countries.add("India");
            countries.add("UK");

            System.out.println("iterate :");
           for (String c:countries){
               System.out.println(c);
        }
    }

}
