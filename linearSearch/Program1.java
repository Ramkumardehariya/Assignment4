// package Assignment4.linearSearch;
import java.util.*;

public class Program1 {

    int linearSearch(int arr[], int size, int target){

        for(int i= 0; i<size; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Program1 p = new Program1();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter a number for find in array: ");
        int num = sc.nextInt();

        System.out.println("The index of number is: "+p.linearSearch(arr, size, num));
    }
}
