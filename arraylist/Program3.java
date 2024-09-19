// package Assignment4.arraylist;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(6);

        // list1.add(7);
        // list1.add(8);
        // list1.add(9);
        // list1.add(10);

        List<Integer> intersection = new ArrayList<>(list1);

        intersection.retainAll(list);

        System.out.println(intersection);

    }
}
