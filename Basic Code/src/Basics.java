public class Basics {
    static void display(Node hed){
        while(hed != null){
            System.out.printf(hed.data+"\t");
            hed = hed.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(1);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        for(int i=0; i<5; i++){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
        display(a);
    }
}
