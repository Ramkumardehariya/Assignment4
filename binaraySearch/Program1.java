// package Assignment4.binaraySearch;
import java.util.*;

public class Program1 {

    int binaraySearch(int arr[], int size, int target){
        int s = 0;
        int e = size-1;

        int mid = s+(e-s)/2;

        while (s <= e) {
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
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
        
        Arrays.sort(arr);

        System.out.println("Enter a number for find in array: ");
        int num = sc.nextInt();

        System.out.println("The index of number is: "+p.binaraySearch(arr, size, num));
    }
}
