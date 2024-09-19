// package Assignment4.sorting;

import java.util.Scanner;

public class Program3 {
    void insertionSort(int arr[]){

        for(int i = 1; i<arr.length; i++){
            int num = arr[i];
            int j = i-1;
            for(; j>=0; j--){
                if(arr[j] > num){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = num;
        }
        
    }

    void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Program3 p = new Program3();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        p.insertionSort(arr);
        p.display(arr);

    }
}
