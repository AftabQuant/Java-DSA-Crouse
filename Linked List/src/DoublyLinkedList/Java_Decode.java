package DoublyLinkedList;

class DLL{
    Node head ; Node tail; int size = 0;
    boolean isPalindrome(Node head, Node tail){
        Node t1 = head; Node t2 = tail;
        while(t1 != null){
            if(t1.data != t2.data) return false;
            t1 = t1.next;
            t2 = t2.prev;
        }
        return true;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtStart(int data){
        Node temp = new Node(data);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head == null) {
            insertAtStart(data);
            return;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void insertAt(int idx, int data){
        Node temp = new Node(data);
        if(head == null){
            insertAtStart(data);
            return;
        }
        if(idx == size){
            insertAtEnd(data);
            return;
        }
        Node x = head;
        if(idx<size && idx>0){
            for(int i= 1; i<idx-1; i++){
                x = x.next;
            }
            temp.next = x.next;
            temp.prev = x;
            x.next = temp;
            x.next.prev = temp;
            size++;
        }
    }
    void deleteAtStart(){
        if(head == null) return;
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtEnd(){
        if(head == null) return;
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void deleteAt(int idx){
        if(idx == 0) {
            deleteAtStart();
            return;
        }
        if(idx == size-1){
            deleteAtEnd();
            return;
        }
        Node temp = head;
        for(int i=1; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev= temp.prev.prev;
        size--;
    }
}
public class Java_Decode{
    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.display();
        ll.insertAtEnd(1);
        ll.insertAtStart(10);
        ll.display();
        ll.insertAtEnd(47);
        ll.insertAtEnd(76);
        ll.display();
        ll.insertAt(2,100);
        ll.display();
        ll.deleteAtStart();
        ll.deleteAtEnd();
        ll.display();
        ll.deleteAt(2);
        ll.display();
    }
}
