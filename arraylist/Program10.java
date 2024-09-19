// package Assignment4.arraylist;

import java.util.ArrayList;

public class Program10 {

    void firstNonRepeatElement(ArrayList<Integer> list){

        for(int i= 0; i<list.size(); i++){
            boolean flag = false;
            for(int j = 0; j<list.size(); j++){
                if(i != j && list.get(i) == list.get(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(list.get(i));
                break;
            }
        }
    }
    public static void main(String[] args) {

        
        Program10 p = new Program10();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);

        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        p.firstNonRepeatElement(list);
    }
}
