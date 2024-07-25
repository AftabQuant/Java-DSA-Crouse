package CircularLinkedList;

class linkedList{
    snode head; snode tail;
    int size;
    void display(){
        snode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            if(temp.next == head) break;
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtStart(int data){
        snode temp = new snode(data);
        if(head== null){
            head = tail = temp;
            tail.next = head;
        }
        else{
            temp.next = head;
            head = temp;
            tail.next = head;
        }
    }
    void insertAtEnd(int data){
        if(head == null){
            insertAtStart(data);
            return;
        }
        snode temp = new snode(data);
        tail.next = temp;
        tail = temp;
        tail.next = head;
        size++;
    }
    void insertAt(int idx, int data){
        if(idx == 0){
            insertAtStart(data);
            return;
        }
        if(idx==size-1){
            insertAtEnd(data);
            return;
        }
        snode temp = new snode(data);
        snode x = head;
        for(int i=1; i<idx-1; i++) x = x.next;
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void deleteAtStart(){
        if(head == null) return;
        head = head.next;
        tail.next = head;
        size--;
    }
    void deleteAt(int idx){
        if(head == null) return;
        snode x = head;
        for(int i=1; i<idx-1; i++) x = x.next;
        x.next = x.next.next;
    }
}
public class singlyLL{
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.display();
        ll.insertAtStart(10);
        ll.insertAtStart(7);
        ll.insertAtStart(1);
        ll.display();
        ll.insertAtEnd(54);
        ll.insertAtEnd(876);
        ll.display();
        ll.insertAt(3,19);
        ll.deleteAt(3);
        ll.display();
        ll.deleteAtStart();
        ll.display();
    }
}
