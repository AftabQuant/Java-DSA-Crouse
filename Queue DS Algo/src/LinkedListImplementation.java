import java.util.Objects;

public class LinkedListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class QueueLL{
        Node head=null;
        Node tail=null;
        void add(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        int remove(){
            Node temp = head;
            head = head.next;
            return temp.data;
        }
        int peek(){
            return head.data;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(2);
        q.display();
        q.add(5);
        q.display();
        q.add(7);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
