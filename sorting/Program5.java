// package Assignment4.sorting;

import java.util.Scanner;

public class Program5 {
    int partition(int arr[], int low, int high){
        int pivot = arr[low];

        int count = 0;

        for(int i = low+1; i<=high; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }

        int pivotIndex = low+count;
        arr[low] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i = low;
        int j = high;

        while(i < pivotIndex &&  j > pivotIndex){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(i < pivotIndex && j > pivotIndex){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    void quickSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }
        int pivot = partition(arr, low , high);

        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }

    void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Program5 p = new Program5();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        p.quickSort(arr, 0, arr.length-1);
        p.display(arr);
    }
}
