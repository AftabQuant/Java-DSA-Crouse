public class ImplementTwo {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int display(Node head){
        int length = 0;
        while(head != null){
            System.out.print(head.data+"\t");
            head = head.next;
            length++;
        }
        return length;
    }
    static int size(Node head){
        int count = 0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
    static void diplayRecer(Node head){
        if(head == null) return;
        System.out.print(head.data+"\t");
        diplayRecer(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        display(temp);
        System.out.println(size(temp));
        diplayRecer(temp);
    }
}
