// package Assignment4.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Program9 {

    boolean checkPalindrome(ArrayList<Integer> list){
        int s= 0;
        int e = list.size()-1;

        while (s < e) {
            if(list.get(s) != list.get(e)){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
    public static void main(String[] args) {

        Program9 p = new Program9();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        boolean palindrome = p.checkPalindrome(list);
        
        if(palindrome == true){
            System.out.println("The list is palindrome");
        }
        else{
            System.out.println("the list is not palindrome");
        }
    }
}
