// package Assignment4.binaraySearch;
import java.util.*;

public class Program4 {

    int findLargest(int arr[], int size, int target){
        int s = 0;
        int e = size-1;
        int mid = s+(e-s)/2;
        int res = 0;

        while (s <= e) {
            if(arr[mid] >= target){
                res = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }

        return res;
    }
    int findSmallest(int arr[], int size, int target){
        int s = 0;
        int e = size-1;
        int mid = s+(e-s)/2;
        int res = 0;

        while (s <= e) {
            if(arr[mid] <= target){
                res = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }

        return res;
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
        
        Arrays.sort(arr);
        System.err.println("Enter a target: ");
        int num = sc.nextInt();

        System.out.println("Smallest element is: "+p.findSmallest(arr, size, num));
        System.out.println("Greater element is: "+p.findLargest(arr, size, num));
    }
}
