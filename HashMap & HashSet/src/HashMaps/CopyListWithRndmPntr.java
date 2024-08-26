package HashMaps;

import java.util.HashMap;

public class CopyListWithRndmPntr{
    class Node{
        int val;
        Node next;
        Node random;
        Node(int val){this.val = val;}
    }
    public Node copyRandomList(Node head) {
        Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;
        while(t1 != null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        Node temp2 = head2;
        while(temp!=null){
            map.put(temp, temp2);
            temp = temp.next;
            temp2 = temp2.next;
        }
        for(Node ori: map.keySet()){
            Node dup = map.get(ori);
            if(ori.random!=null) dup.random = map.get(ori.random);
        }
        return head2;
    }
    public static void main(String[] args) {

    }
}
