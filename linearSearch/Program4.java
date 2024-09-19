// package Assignment4.linearSearch;
import java.util.*;

public class Program4 {

    int linearSearch(String str, char ch){
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Program4 p = new Program4();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a stirng: ");
        String str = sc.nextLine();


        System.out.println("Enter a charcter: ");
        char ch = sc.nextLine().charAt(0);

        System.out.println("count the character is: "+p.linearSearch(str, ch));
    }
}
