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

    void printList(LinkedList list){
        Node temp = list.head;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}



public class Program1 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertTail(list, 4);
        list.printList(list);


        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, "ram");
        list.insertTail(list, 7);
        list.insertTail(list, "shyam");
        list.printList(list);

        list.deleteFromHead(list);
        list.deleteFromHead(list);

        list.printList(list);
    }
}
