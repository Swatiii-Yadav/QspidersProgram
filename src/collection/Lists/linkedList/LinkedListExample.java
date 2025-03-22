package collection.Lists.linkedList;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(35);
        list.removeFirst();
        list.removeLast();
        System.out.println("Size of LinkedList: " + list.size());

        System.out.println("LinkedList Elements:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}


