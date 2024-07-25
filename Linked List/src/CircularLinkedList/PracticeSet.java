package CircularLinkedList;

public class PracticeSet {
    static class Dll{
        Node head = null;
        void insertAtStart(int val){
            Node temp =new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head.prev = temp;
                head = temp;
            }
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i=0; i<idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            t.prev=temp;
            temp.next.prev=t;
        }
        void insertAtEnd(int val){
            Node t = head;
            Node temp = new Node(val);
            while(t.next!=null) t = t.next;
            t.next = temp;
            temp.prev = t;
            }
        void deleteAtStart(){
            head = head.next;
            head.prev  = null;
        }
        void deleteAt(int idx){
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
        void deleteAtEnd(){
            Node temp = head;
            if(temp.next!=null){
                temp = temp.next;
            }
            temp=temp.prev;
            temp.next = null;
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
        Dll ll = new Dll();
        ll.insertAtStart(2);
        ll.insertAtStart(1);
        ll.insertAtStart(0);
        ll.display();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAt(2,10);
        ll.display();
        ll.insertAt(2,20);
        ll.display();
        ll.deleteAtStart();
        ll.display();
        ll.deleteAt(2);
        ll.display();
    }
}
