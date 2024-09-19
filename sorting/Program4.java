// package Assignment4.sorting;

import java.util.Scanner;

public class Program4 {

    void merge(int arr[], int low, int high){
        int mid = low+(high-low)/2;

        int size1 = mid-low+1;
        int size2 = high-mid;

        int first[] = new int[size1];
        int second[] = new int[size2];

        int k = low;

        for(int  i = 0; i<size1; i++){
            first[i] = arr[k++];
        }

        k = mid+1;
        for(int i = 0; i<size2; i++){
            second[i] = arr[k++];
        }

        int index1 = 0;
        int index2 = 0;
        int mainIndex = low;

        while (index1 < size1 && index2 < size2) {
            if(first[index1] < second[index2]){
                arr[mainIndex++] = first[index1++];
            }
            else{
                arr[mainIndex++] = second[index2++];
            }
        }

        while (index1 < size1) {
            arr[mainIndex++] = first[index1++];
        }

        while(index2 < size2){
            arr[mainIndex++] = second[index2++];
        }
    }

    void mergeSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int mid = low+(high-low)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(arr, low, high);
    }

    void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Program4 p = new Program4();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        p.mergeSort(arr, 0, arr.length-1);
        p.display(arr);
    }
}
