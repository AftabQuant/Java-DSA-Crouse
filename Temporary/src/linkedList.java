class Node{
    int data;
    Node next;
    Node(int data) {this.data=data;}
}
class llinkedlist{
    Node head = null;
    Node tail = null;
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head==null)head = temp;
        else tail.next = temp;
        tail = temp;
    }
}
public class linkedList{
    public static void main(String[] args) {
        llinkedlist ll = new llinkedlist();
        ll.insertAtEnd(3);
        ll.display();
        ll.insertAtEnd(6);
        ll.display();
        ll.insertAtEnd(9);
        ll.display();
    }
}
