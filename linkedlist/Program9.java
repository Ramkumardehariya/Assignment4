// package Assignment4.linkedlist;

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

    void splitList(LinkedList list){

        if(list.head == null || list.head.next == null){
            return;
        }
        Node prev = list.head;
        Node curr = list.head.next;

        while (curr.next != null) {
            prev = prev.next;
            curr = curr.next;

            if(curr.next != null){
                curr = curr.next;
            }
        }

        LinkedList list1 = new LinkedList();
        list1.head = prev.next;
        prev.next = null;


        System.out.println("Split list is : ");
        printList(list);
        printList(list1);
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



public class Program9 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertTail(list, 4);
        list.printList(list);


        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, 7);
        list.insertTail(list, 8);
        list.insertTail(list, 9);
        list.insertTail(list, 10);

        System.out.println("Original list: ");
        list.printList(list);

        list.splitList(list);
    }
}
