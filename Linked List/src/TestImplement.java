public class TestImplement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
        }
        static class linkedlist{
        Node head = null;
        Node tail = null;
        int count =0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else tail.next = temp;
            tail = temp;
            count++;
        }
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            count++;
        }
        void insertAt(int idx,int val){
            Node te = new Node(val);
            Node temp = head;
            if(idx==count){
                insertAtEnd(val);
                return;
            }
            if(idx==0){
                insertAtStart(val);
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            te.next = temp.next;
            temp.next = te;
            count++;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
        int getEle(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
        ll.insertAtStart(3);
        ll.display();
        ll.insertAtStart(2);
        ll.display();
        ll.insertAt(5,10);
        ll.display();
        System.out.println(ll.getEle(5));
    }
}
