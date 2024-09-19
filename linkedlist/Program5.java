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

    LinkedList mergeTwoList(LinkedList list1, LinkedList list2){
        LinkedList node = new LinkedList();
        node.head = null;
        node.tail = null;

        Node l1 = list1.head;
        Node l2 = list2.head;
        
        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                if(node.head == null){
                    node.head = l1;
                    node.tail = l1;
                    l1 = l1.next;
                }
                else{
                    node.tail.next = l1;
                    node.tail = l1;
                    l1 = l1.next;
                }
            }
            else{
                if(node.head == null){
                    node.head = l2;
                    node.tail = l2;
                    l2 = l2.next;
                }
                else{
                    node.tail.next = l2;
                    node.tail = l2;
                    l2 = l2.next;
                }
            }
        }

        while(l1 != null){
            if(head == null){
                    node.head = l1;
                    node.tail = l1;
                    l1 = l1.next;
                }
                else{
                    node.tail.next = l1;
                    node.tail = l1;
                    l1 = l1.next;
                }
        }
        while(l2 != null){
            if(head == null){
                    node.head = l2;
                    node.tail = l2;
                    l2 = l2.next;
                }
                else{
                    node.tail.next = l2;
                    node.tail = l2;
                    l2 = l2.next;
                }
        }

        return node;
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



public class Program5 {
    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();

        list1.insertTail(list1, 1);

        list1.insertTail(list1, 2);
        list1.insertTail(list1, 4);
        list1.insertTail(list1, 6);
        list1.insertTail(list1, 8);
        list1.insertTail(list1, 10);
        list1.insertTail(list1, 12);
        list1.printList(list1);

        System.out.println("head is: "+list1.head.data);
        System.out.println("tail is: "+list1.tail.data);

        LinkedList list2 = new LinkedList();

        list1.insertTail(list2, 3);
        list2.insertTail(list2, 5);
        list2.insertTail(list2, 7);
        list1.insertTail(list2, 9);
        list1.insertTail(list2, 10);
        list2.insertTail(list2, 11);
        list1.insertTail(list2, 12);
        list2.insertTail(list2, 13);
        list1.insertTail(list2, 14);
        list2.insertTail(list2, 15);


        LinkedList list = new LinkedList();
        list = list1.mergeTwoList(list1, list2);

        list1.printList(list);
    }
}


