package DoublyLinkedList;
public class Implementation {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){ this.data=data;}
    }
    static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }
        void insertAt(int idx,int val){
            Node temp = new Node(val);
            Node t = head;
            for(int i=0; i<idx-1; i++){
                t = t.next;
            }
            temp.next = t.next;
            temp.prev = t;
            t.next = temp;
            t.next.prev = temp;

        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            Node t = head;
            while(t.next!=null) {
               t = t.next;
            }
            t.next = temp;
            temp.prev = t;
            tail = temp;
        }
        void deleteAtStart(){
            head = head.next;
            head.prev =null;
        }
        void deleteAtEnd(){
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp = temp.prev;
            temp.next = null;
        }
        void deleteAt(int idx){
            Node temp = head;
            for(int i=0; i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
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
        linkedlist ll = new linkedlist();
        ll.insertAtStart(2);
        ll.insertAtStart(3);
        ll.insertAtStart(4);
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.display();
    }
}
