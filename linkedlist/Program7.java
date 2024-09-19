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

    void insertTail(LinkedList list, int data){
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

    void findNthNode(LinkedList list,int n){
        int count = 1;
        Node curr1 = list.head;
        Node curr2 = list.head;

        while (curr1.next != null) {
            curr1 = curr1.next;
            count++;
        }
        int i = 1;
        System.out.println("count is: "+count);

        while (i <= count -n && curr2 != null) {
            curr2 = curr2.next;
            i++;
        }

        System.out.println("The nth node is "+curr2.data);
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



public class Program7 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertTail(list, 4);
        list.insertTail(list, 5);
        list.insertTail(list, 6);
        list.insertTail(list, 7);
        list.insertTail(list, 8);
        list.insertTail(list, 9);
        

        list.printList(list);

        list.findNthNode(list, 6);
    }
}
