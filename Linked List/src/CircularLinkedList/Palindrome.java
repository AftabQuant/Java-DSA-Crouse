package CircularLinkedList;

import java.util.Scanner;

public class Palindrome {
    static class dll{
        int data;
        dll next;
        dll prev;
        dll(int data){
            this.data = data;
        }
    }
    static void display(dll head){
        dll temp = head;
        dll s = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        while(s!=temp){
            if(s.data != temp.data) return;
            else{
                s = s.next;
                temp = temp.prev;
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        dll a = new dll(3);
        dll b = new dll(5);
        dll c = new dll(7);
        dll d = new dll(5);
        dll e = new dll(3);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        display(a);
    }
}
