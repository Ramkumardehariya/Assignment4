// package Assignment4.arraylist;

import java.util.*;

public class Program5 {
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

        int s = 0;
        int e = list.size()-1;

        while (s < e) {
            Collections.swap(list, s, e);
            s++;
            e--;
        }

        System.out.println(list);
    }
}
