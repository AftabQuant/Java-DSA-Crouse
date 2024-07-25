package Question;
public class LinkedlistImplement {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class Stack{
        Node head = null;
        int size = 0;
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int peek(){
            return head.data;
        }
        int pop(){
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
        int size(){
            return size;
        }
        void displayrec(Node h){
            if(h==null){
                return;
            }
            displayrec(h.next);
            System.out.print(h.data+"\t");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(22);
        st.push(2);
        st.display();
    }
}
