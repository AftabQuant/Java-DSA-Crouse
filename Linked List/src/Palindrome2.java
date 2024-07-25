import CircularLinkedList.Palindrome;

public class Palindrome2 {
    static class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data = data;
        }
    }
    static class linkedlist{
        Node head = null;
        int palin(String data){
            Node left = head;
            Node temp = head;
            Node right = null;
            while(temp.next!=null){
                temp = temp.next;
            }
            right = temp.next;
            while(left!=right){
                if(left.data!=right.data) return -1;
                else{
                    left = left.next;
                    right = right.prev;
                }
            }
            return 1;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        System.out.println(ll.palin("abcba"));
    }
}
