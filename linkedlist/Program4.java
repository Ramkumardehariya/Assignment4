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

    void findMiddleNode(LinkedList list){

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

        System.out.println("The middle node is: "+prev.data);
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



public class Program4 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertTail(list, 4);
        list.printList(list);


        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, 8);
        list.insertTail(list, 7);
        list.insertTail(list, 7);
        list.insertTail(list, 10);

        list.printList(list);
        list.findMiddleNode(list);
    }
}
