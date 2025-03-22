package collection.Lists.linkedList;

import java.util.LinkedList;

public class LinkedListPro1 {

        public static void main(String[] args) {
            // 1. Create and Add Elements
            LinkedList<Integer> list = new LinkedList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            System.out.println("Initial List: " + list);
            list.addFirst(5);
            list.addLast(35);
            System.out.println("After adding first & last: " + list);
         //
            list.removeFirst();
            list.removeLast();
            System.out.println("After removing first & last: " + list);
        //
            System.out.println("First Element: " + list.getFirst());
            System.out.println("Last Element: " + list.getLast());
//
            System.out.println("Is list empty? " + list.isEmpty());


            System.out.println("Index of 20: " + list.indexOf(20));


            System.out.println("Contains 30? " + list.contains(30));

            System.out.println("List size: " + list.size());

            for (int num : list) {
                System.out.println("Number: " + num);
            }

            list.clear();
            System.out.println("After clearing: " + list);
        }
    }


