// package Assignment4.linkedlist;

import java.util.HashSet;;

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

    void removeDuplicate(LinkedList list){
        HashSet<Integer> seen = new HashSet<>();

        Node curr = list.head;
        Node prev = null;

        while (curr != null) {
            if(seen.contains(curr.data)){
                Node temp = curr.next;
                prev.next = curr.next;
                curr = temp;
            }
            else{
                seen.add(curr.data);
                prev = curr;
                curr = curr.next;
            }
        }
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



public class Program6 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertTail(list, 4);
        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, 9);
        list.insertTail(list, 7);
        list.insertTail(list, 3);

        
        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, 9);
        list.insertTail(list, 7);
        list.insertTail(list, 3);
        
        list.printList(list);
        list.removeDuplicate(list);
        list.printList(list);
    }
}
