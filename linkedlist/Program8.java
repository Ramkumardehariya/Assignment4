// package Assignment4.linkedlist;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    Node tail;

    void insertTail(LinkedList list, int data){
        Node node = new Node(data);

        if(list.head == null){
            head = node;
            tail = node;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp= temp.next;
            }

            temp.next = node;
            tail = node;
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

    void reverseLinkedList(LinkedList list){
        Node prev = null;
        Node curr = list.head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        list.head = prev;
    }



    LinkedList addTwoList(LinkedList list1, LinkedList list2){
        LinkedList add = new LinkedList();
        reverseLinkedList(list1);
        reverseLinkedList(list2);

        Node l1 = list1.head;
        Node l2 = list2.head;
        int rem = 0;

        while (l1 != null && l2 != null) {
            int num = l1.data + l2.data + rem;
            rem = num/10;
            int n = num%10;
            Node temp = new Node(n);

            if(add.head == null){
                add.head = temp;
                add.tail = temp;
            }
            else{
                Node curr = add.head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = temp;
                add.tail = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int num = l1.data + rem;
            rem = num/10;
            int n = num%10;
            Node temp = new Node(n);

            if(add.head == null){
                add.head = temp;
                add.tail = temp;
            }
            else{
                add.tail.next = temp;
                add.tail = temp;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            int num = l2.data + rem;
            rem = num/10;
            int n = num%10;
            Node temp = new Node(n);

            if(add.head == null){
                add.head = temp;
                add.tail = temp;
            }
            else{
                add.tail.next = temp;
                add.tail = temp;
            }
            l2 =l2.next;
        }

        while (rem != 0) {
            Node temp = new Node(rem);

            if(add.head == null){
                add.head = temp;
                add.tail = temp;
            }
            else{
                add.tail.next = temp;
                add.tail = temp;
            }

            rem = rem/10;
        }

        reverseLinkedList(add);
        return add;
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



public class Program8 {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();

        list1.insertTail(list1, 9);
        list1.insertTail(list1, 9);
        list1.insertTail(list1, 9);
        list1.insertTail(list1, 9);
        
        LinkedList list2 = new LinkedList();
        
        list2.insertTail(list2, 9);
        list2.insertTail(list2, 9);
        list2.insertTail(list2, 9);
        list2.insertTail(list2, 9);

        list1.printList(list1);
        list1.printList(list2);

        LinkedList add = new LinkedList();
        add = list1.addTwoList(list1, list2);

        System.out.println("added list: ");

        list1.printList(add);
    }
}
