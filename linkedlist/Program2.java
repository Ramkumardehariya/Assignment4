// package Assignment4.linkedlist;


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

    void printList(LinkedList list){
        Node temp = list.head;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Program2 {

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertTail(list,3);
        list.insertTail(list,4);
        list.insertTail(list,5);
        list.insertTail(list,6);
        list.insertTail(list,7);
        list.insertTail(list,8);

        list.printList(list);

        list.reverseLinkedList(list);
        list.printList(list);

        // list.makeCycle(list);

        boolean temp = list.detectCycle(list);

        if(temp == true){
            System.out.println("There is cycle ");
        }
        else{
            System.out.println("There is no cycle ");
        }
    }
}
