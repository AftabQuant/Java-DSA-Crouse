package Java_Decode;
class linkedList{
    Node head ; int size = 0;
    void push(int val){
        Node temp = new Node(val);
        if(head==null) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    int peek(){
        return head.val;
    }
    int pop(){
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }
    void display(){
        disRev(head);
        System.out.println();
    }
    void disRev(Node head){
        if(head == null) return;
        disRev(head.next);
        System.out.print(head.val+" ");
    }
    int size(){
        return size;
    }
}
public class LinkedListImplementation{
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.display();
        ll.pop();
        ll.display();
        System.out.println(ll.peek());
        System.out.println(ll.size);
    }
}
