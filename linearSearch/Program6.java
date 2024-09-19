// package Assignment4.linearSearch;
import java.util.*;

public class Program6 {

    void findAllIndex(int arr[], int size, int num){

        for(int i = 0; i<size; i++){
            if(arr[i] == num){
                System.out.print(i+" ");
            }
        }
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
        System.out.println("Enter a number for finding inedexes: ");
        int num = sc.nextInt();

       System.out.println("find all indexes is: ");
       p.findAllIndex(arr, size, num);
    }
}
