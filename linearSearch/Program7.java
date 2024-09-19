// package Assignment4.linearSearch;

import java.util.*;

public class Program7 {

    char findOccurance(String str){
        int arr[] = new int[26];

        for(int i = 0; i<str.length(); i++){
            arr[str.charAt(i)-'a']++;
        }

        for(int i = 0; i<str.length(); i++){
            if(arr[str.charAt(i)-'a'] == 1){
                return str.charAt(i);
            }

        }

        return 'a';
    }
    public static void main(String[] args) {
        Program p = new Program();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("First non duplicate character is: "+p.findOccurance(str));
    }
}
