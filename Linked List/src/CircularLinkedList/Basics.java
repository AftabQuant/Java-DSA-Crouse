package CircularLinkedList;

public class Basics {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head.next;
        while(temp != null){
            System.out.println(temp.data+"\t");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        System.out.println(a.data);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
    }
}
