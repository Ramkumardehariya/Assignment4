// package Assignment4.sorting;

import java.util.Scanner;

public class Program2 {
    void Selection(int arr[]){

        for(int i = 0; i<arr.length; i++){
            int minIndex = i;

            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
    }

    void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Program2 p = new Program2();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        p.Selection(arr);
        p.display(arr);

    }
}
