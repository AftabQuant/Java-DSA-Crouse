package DoublyLinkedList;

import java.util.SortedMap;
import java.util.prefs.NodeChangeEvent;

public class Main {
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    static void displayRev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void display2(Node random){
          Node temp = random;
          while(temp.prev!=null){
              temp=temp.prev;
          }
          display(temp);
    }
    static Node insertAtStart(Node head,int val){
        Node temp = new Node(val);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }
    static Node insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
//        tail.next=temp;
//        temp.prev = tail;
//        tail = temp;
        while(t.next!=null){
            t=t.next;
        };
        t.next=temp;
        temp.prev = t;
        t = temp;
        return t;
    }
    static boolean palindrome(Node head){
        Node temp = head;
        Node left = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(left!=temp){
            if(left.data!=temp.data){
                return false;
            }
            else{
                left = left.next;
                temp = temp.prev;
            }
        }
        return true;
    }
    static int targetSum(int target,Node head){
        Node temp = head;
        Node left = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(left.data < temp.data){
            if(head.data+temp.data == target){
                return (head.data+temp.data);
            } else if(head.data+temp.data>target){
                temp=temp.prev;
            }
            else{
                left=left.next;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Node a= new Node(3);
        Node b= new Node(4);
        Node c= new Node(5);
        Node d= new Node(4);
        Node e= new Node(3);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        System.out.println(targetSum(7,a));
    }
}
