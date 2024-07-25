

public class Main {
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
    }
    static void displayRecursive(Node head){
        if(head == null) return;
        System.out.print(head.data+"\t");
        displayRecursive(head.next);
    }
    static void displayReverse(Node head){
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data+"\t");
    }
    static int length(Node head){
        int count=0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){this.data = data;}
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
//        System.out.println(a.data);
////        System.out.println(a.next);
////        System.out.println(a.next.data);//5
////        System.out.println(b.next.data);//6
////        System.out.println(b.next);
//        Node temp = a;
//        for(int i=1; i<=5; i++){
//            System.out.print(temp.data+"\t");
//            temp = temp.next;
//        }
//        System.out.println();
//        printLinkedList(a);
//        System.out.println();
//        displayRecursive(a);
//        System.out.println();
//        displayReverse(a);
//        System.out.println(length(a));
        displayReverse(a);
    }
}