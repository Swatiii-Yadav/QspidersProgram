package collection.Lists.arratList;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersinanArrayList {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list, 16, 17, 4, 3, 5, 2);

            ArrayList<Integer> leaders = new ArrayList<>();
            int maxRight = list.get(list.size() - 1);
            leaders.add(maxRight);

            for (int i = list.size() - 2; i >= 0; i--) {
                if (list.get(i) > maxRight) {
                    maxRight = list.get(i);
                    leaders.add(maxRight);
                }
            }

            Collections.reverse(leaders);
            System.out.println("Leaders: " + leaders);
        }
    }


