import java.util.Arrays;
import java.util.Scanner;

public class Program6 {

    int findBitonicElement(int arr[], int size){
        int s = 0;
        int e = size-1;
        int mid = s+(e-s)/2;

        while (s <= e) {
            if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == size-1 || arr[mid] < arr[mid+1])){
                return mid;
            }
            if(mid > 0 && arr[mid-1] > arr[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Program6 p = new Program6();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        System.out.println("Enter all number for array: ");

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        System.out.println("The bitonic index is: "+p.findBitonicElement(arr, size));
    }
}
