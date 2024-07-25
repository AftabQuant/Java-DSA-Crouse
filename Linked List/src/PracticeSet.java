public class PracticeSet {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtStart(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            Node temp=new Node(val);
            Node t=head;
            if(idx==0){
                insertAtStart(val);
                return;
            }
            else if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Wrong index");
                return;
            }
            for(int i=0;i<idx-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
            size++;
        }
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void deleteAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;
            size--;
        }
        void deleteAtStart(){
            head=head.next;
            }
        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
            System.out.println();
        }
        int getEle(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtStart(3);
        ll.display();
        ll.insertAtStart(2);
        ll.display(); // 2 3 4 5
        ll.insertAt(2,10); // 2 3 10 4 5
        ll.display();
//        System.out.println(ll.getEle(2));
        ll.deleteAt(4);
        ll.display();
        ll.deleteAtStart();
        ll.display();
        ll.deleteAt(2);
        ll.display();
    }
}
