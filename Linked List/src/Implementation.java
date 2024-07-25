public class Implementation {
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
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtStart(int vall){
            Node temp = new Node(vall);
                if(head==null){
                    head = temp;
                    tail = temp;
                }
                else{
                    temp.next = head;
                    head = temp;
                }
            }
            void insertAtIdx(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == 0){
                insertAtStart(val);
                return;
            }
            else if(idx==size()){
                insertAtEnd(val);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            }
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"\t");
                temp =temp.next;
            }
            System.out.println();
        }
        int size(){
            int count = 0;
            while(head != null){
                count++;
                head = head.next;
            }
            return count;
        }
        int getAt(int idx){
            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(5);
        ll.display();
        ll.insertAtEnd(6);
        ll.display();
        ll.insertAtEnd(7);
        ll.display();
        ll.insertAtStart(3);
        ll.display();
        ll.insertAtStart(1);
        ll.display();
//        ll.insertAtIdx(2,10); // 1 3 10 5 6 7
//        ll.display();
        System.out.println(ll.getAt(3)); //
    }
}
