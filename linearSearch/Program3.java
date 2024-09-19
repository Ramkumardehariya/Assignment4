// package Assignment4.linearSearch;
import java.util.*;

public class Program3 {

    int linearSearch(int arr[], int size, int target){

        for(int i = 0; i<size; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
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

        System.out.println("Enter a target value: ");
        int num =  sc.nextInt();

        System.out.println(p.linearSearch(arr, size, num));
    }
}
