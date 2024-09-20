// package Assignment4.linkedlist;

import java.util.Scanner;

class Node{
    Object data;
    Node next;

    Node(Object data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void insertTail(LinkedList list, Object data){
        Node node = new Node(data);

        if(list.head == null){
            head = node;
            
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp= temp.next;
            }

            temp.next = node;
            
        }
    }
    
    void deleteFromHead(LinkedList list){
        if(list.head == null){
            return;
        }
        else{
            Node temp = list.head;
            temp = temp.next;
            list.head = temp;
        }
    }

    LinkedList rotateList(LinkedList list, int n){
        LinkedList list1 = new LinkedList();
        if(n == 0 || n== 1){
            return list;
        }

        int count = 1;
        Node curr = list.head;

        while (curr != null) {
            curr = curr.next;
            count++;
        }

        int num = 1;
        curr = list.head;
        

        while (num != count-n && curr.next != null) {
            curr = curr.next;
            num++;
            if(curr.next == null){
                curr = list.head;
            }
        }

        list1.head = curr.next;
        curr.next = null;

        curr = list1.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = list.head;

        return list1;
    }

    void printList(LinkedList list){
        Node temp = list.head;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}



public class Program10 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertTail(list, 4);
        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, 7);
        list.insertTail(list, 8);
        list.insertTail(list, 9);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for rotate list: ");
        int n = sc.nextInt();

        list.printList(list);

        LinkedList list1 = new LinkedList();

        list1 = list.rotateList(list, n);

        list.printList(list1);
    }
}
