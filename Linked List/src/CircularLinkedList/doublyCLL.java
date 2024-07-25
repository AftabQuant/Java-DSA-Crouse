package CircularLinkedList;

class linkedLust{
    Node head; Node tail; int size = 0;
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            if(temp.next == head) break;
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
            tail.next = head;
        }
        size++;
    }
    void insertAtEnd(int data){
        if(head == null) return;
        Node temp = new Node(data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        tail.next = head;
        size++;
    }
    void insertAt(int idx, int data){
        if(idx == 0){
            insertAtStart(data);
            return;
        }
        if(idx == size-1){
            insertAtEnd(data);
            return;
        }
        Node x = head;
        Node temp = new Node(data);
        for(int i=1; i<idx-1; i++) x = x.next;
        temp.next = x.next;
        temp.prev = x;
        x.next = temp;
        x.next.prev = temp;
        size++;
    }
    void deleteAtStart(){
        if(head == null) return;
        head = head.next;
        head.prev = null;
        tail = head;
        size--;
    }
    void deleteAt(int idx){
        Node x = head;
        for(int i=1; i<idx-1; i++) x = x.next;
        x.next = x.next.next;
        x.next.prev = x;
    }
}
public class doublyCLL {
    public static void main(String[] args) {
        linkedLust ll = new linkedLust();
        ll.display();
        ll.insertAtStart(10);
        ll.display();
        ll.insertAtStart(48);
        ll.insertAtStart(37);
        ll.insertAtEnd(34);
        ll.insertAt(2,100);
        ll.display();
        ll.deleteAtStart();
        ll.deleteAt(2);
        ll.display();
    }
}
