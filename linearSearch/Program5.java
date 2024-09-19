// package Assignment4.linearSearch;
import java.util.*;

public class Program5 {

    int findMax(int arr[], int size){
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i<size; i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
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

        System.out.println("Maximum element is: "+p.findMax(arr, size));
    }
}
