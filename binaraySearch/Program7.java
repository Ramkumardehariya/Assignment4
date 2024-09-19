import java.util.Scanner;

public class Program7 {

    int findSquareRoot(int num){
        int s = 2;
        int e = num/2+1;
        int mid = s+(e-s)/2;
        int res = mid;

        while (s <= e) {
            if(mid*mid == num){
                return mid;
            }
            if(mid*mid > num){
                res = mid;
                e = mid-1;
            }
            else{
                res = mid;
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }

        return res;
    }
    public static void main(String[] args) {
        Program7 p = new Program7();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for square root: ");
        int num = sc.nextInt();

        System.out.println("The square root is: "+ p.findSquareRoot(num));
    }
}
