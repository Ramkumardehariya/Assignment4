// package Assignment4.binaraySearch;
import java.util.*;

public class Program3 {

    int findOccurance(int arr[], int size, int target, String key){
        int s = 0;
        int e = size-1;
        int mid = s+(e-s)/2;
        int res = -1;

        while (s <= e) {
            if(arr[mid] == target){
                res = mid;
                if(key.equals("first")){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else if(arr[mid] > target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return res;
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
        
        Arrays.sort(arr);
        System.err.println("Enter a target: ");
        int num = sc.nextInt();

        System.out.println("first occurance is: "+p.findOccurance(arr, size, num, "first"));
        System.out.println("last occurance is: "+p.findOccurance(arr, size, num, "last"));
    }
}
