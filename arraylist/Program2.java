// package Assignment4.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import set.Program2;

public class Program2 {
    public static void main(String[] args) {
        Program2 p = new Program2();

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

        Set<Integer> list1 = new LinkedHashSet<>();

        for(Integer it : list){
            list1.add(it);
        }

        for(Integer num : list1){
            System.out.println(num+" ");
        }
    }
}
