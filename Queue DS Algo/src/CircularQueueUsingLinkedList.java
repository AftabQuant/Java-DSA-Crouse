public class CircularQueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class LinkedList{
        Node head= null;
        Node tail = null;
        int size = 0;
        void add(int data){
            Node temp = new Node(data);
            if(head==null) head = temp;
            else tail.next = temp;
            tail = temp;
            tail.next = head;
            size++;
        }
        int remove() throws Exception{
            if(size==0){
                throw new Exception("Empty Queue!");
            }
            else{
                int x = head.data;
                head = head.next;
                tail.next = head;
                size--;
                return x;
            }
        }
        int peek(){
            return head.data;
        }
        void display(){
            Node temp = head;
            while(temp!=tail){
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        LinkedList q = new LinkedList();
        q.add(7);
        q.add(4);
        q.add(4);
        q.display();
    }
}
