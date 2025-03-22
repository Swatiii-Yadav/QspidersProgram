package collection.Lists.arratList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNMinInArrayList {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(30);
            numbers.add(5);
            numbers.add(50);

            int max = Collections.max(numbers);
            int min = Collections.min(numbers);

            System.out.println("Max value: " + max);
            System.out.println("Min value: " + min);
        }
    }


