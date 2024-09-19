// package Assignment4.arraylist;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        Program1 p = new Program1();

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

        Set<Integer> list1 = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for(Integer it : list){
            if(!list1.add(it)){
                set1.add(it);
            }
        }

        for(Integer num : set1){
            System.out.println(num+" ");
        }
        
        
    }
}
