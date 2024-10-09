package JavaDecodeBatch;
class Node{
    int val;
    Node next;
    Node(int val){this.val = val;}
}
class Que{
    Node head; Node tail;
    int size = 0;
    void add(int val){
        Node temp = new Node(val);
        if(head == null) head = temp;
        else tail.next = temp;
        tail = temp;
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+",");
            temp = temp.next;
        }
        System.out.println();
    }
    int remove(){
        if(size==0) return -1;
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    int peek(){
        return head.val;
    }
    int size(){
        return size;
    }
}
public class LLImplement{
    public static void main(String[] args) {
        Que q = new Que();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5); q.add(6);
        q.display();
        q.remove();
        q.display();
        q.add(7);
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());
        q.display();

    }
}
