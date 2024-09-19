// package Assignment4.linearSearch;

import java.util.*;

public class Program2 {

    int linearSearch(String arr[], int size, String target){

        for(int i= 0; i<=size; i++){
            if(arr[i].equals(target)){
                return i-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Program2 p = new Program2();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        String arr[] = new String[size+1];

        for(int i = 0; i<=size; i++){
            arr[i] = sc.nextLine();
        }
        
        System.out.println("Enter a stirng for find in array: ");
        String str = sc.nextLine();

        System.out.println("The index of stirng is: "+p.linearSearch(arr, size, str));
    }
}
