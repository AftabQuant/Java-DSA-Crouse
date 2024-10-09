
class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }
}

class Deque {
    Node rear;
    Node front;
    int size = 0;

    void insertRear(int val) {
        Node temp = new Node(val);
        if (rear == null) {
            front = temp;
        } else {
            rear.next = temp;
            temp.prev = rear;
        }
        rear = temp;
        size++;
    }
    void insertFront(int val){
        Node temp = new Node(val);
        if(front==null) front = rear = temp;
        else{
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }
    int deleteFront(){
        if(front == null) return -1;
        int x = front.val;
        front = front.next;
        front.prev = null;
        size--;
        return x;
    }
    int deleteRear(){
        if(front == null) return -1;
        int x = rear.val;
        rear = rear.prev;
        rear.next = null;
        size--;
        return x;
    }
    int getRear(){
        return rear.val;
    }
    int getFront(){
        return front.val;
    }
    int size(){return size;}
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DequeImplementLL {
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.insertRear(1);
        dq.insertRear(2);
        dq.insertRear(3);
        dq.insertRear(4);
        dq.display();
        dq.insertFront(6);
        dq.insertFront(5);
        dq.display();
        dq.deleteRear();
        dq.deleteFront();
        dq.display();
        System.out.println(dq.getRear());
        System.out.println(dq.getFront());
    }
}
