// package Assignment4.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program7 {

    void selectionSort(ArrayList<Integer> list){
        int n = list.size();

        for(int i = 0; i<n; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(list.get(minIndex) > list.get(j)){
                    minIndex = j;
                }
            }
            Collections.swap(list,i, minIndex);
        }
    }
    public static void main(String[] args) {

        Program7 p = new Program7();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        p.selectionSort(list);

        System.out.println(list);

    }
}
