package Java_Decode;
class linkedList{ // User Defined Data Structure
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayRecursive(Node head){
        if(head == null) return;
        System.out.print(head.data);
        displayRecursive(head.next);
    }
    void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head==null) head=temp;
        else tail.next = temp;
        tail = temp;
        size++;
    }
    void insertAtStart(int data){
        Node temp = new Node(data);
        if(head==null) insertAtEnd(data);
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAt(int idx, int data){
        Node temp = new Node(data);
        Node a = head;
        if(idx==0){
            insertAtStart(data);
            return;
        }
        else if(idx==size){
            insertAtEnd(data);
            return;
        }
        else if(idx>size|| idx<0){
            System.out.println("Out of bound");
            return;
        }
        for(int i=0; i<idx-1; i++){
            a = a.next;
        }
        temp.next=a.next;
        a.next=temp;
        size++;
    }
    int getElement(int idx) throws Error{
        Node temp= head;
        if(idx>size|| idx<0){
            throw new Error("Invalid index!!!!");
        }
        for(int i=0; i<idx; i++) temp=temp.next;
        return temp.data;
    }
    void deleteAtStart()throws Error{
        if(head==null){
            throw new Error("Empty Linked List!!!!!!");
        }
        else{
            head = head.next;
            size--;
        }
    }
    void deleteAt(int idx) throws Error{
        if(idx==0) throw new Error("Empty Linked List!!!");
        if(idx>size ||idx<0) throw new Error("Empty Linked List!!!");
        Node temp = head;
        for(int i=0; i<idx-1; i++) temp = temp.next;
        temp.next = temp.next.next;
        if(temp.next==tail) tail=temp;
        size--;
    }
}
public class Introduction {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.display();
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAt(4,80);
        ll.insertAtEnd(50);
        ll.display();
        ll.insertAtStart(5);
        ll.insertAt(2,98);
        ll.display();
        ll.deleteAtStart();
        ll.display();
        ll.display();
        System.out.println(ll.tail.data);
    }
}
