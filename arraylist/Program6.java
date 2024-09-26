// package Assignment4.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import basicException.Program6;

public class Program6 {

    void reverse(ArrayList<Integer> list , int s, int e){

        while (s < e) {
            Collections.swap(list, s, e);
            s++;
            e--;
        }
    }

    void rotateList(ArrayList<Integer> list, int k){
        int n = list.size();

        k = k%n;

        reverse(list,0, n-1);


        reverse(list,0, k-1);

        reverse(list,k , n-1);
        
    }
    public static void main(String[] args) {

        Program6 p = new Program6();

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position: ");
        int k = sc.nextInt();

        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println("Original list: "+list);
        p.rotateList(list, k-1);

        System.out.println("rotate list: "+list);
    }
}
