package BinaryTree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){this.val=val;}
}
public class Main {
    static int sum(Node rot){
        if(rot==null) return 0;
        return rot.val+sum(rot.left)+sum(rot.right);
    }
    static int pro(Node rot){
        if(rot==null) return 1;
        return rot.val*pro(rot.left)*pro(rot.right);
    }
    static int maximum(Node rot){
        if(rot==null) return Integer.MIN_VALUE;
        return Math.max(rot.val,Math.max(maximum(rot.left),maximum(rot.right)));
    }
    static int minimum(Node rot){
        if(rot==null) return Integer.MAX_VALUE;
        return Math.min(rot.val,Math.min(minimum(rot.left),minimum(rot.right)));
    }
    static void display(Node rot){
        if(rot==null) return;
        System.out.print(rot.val+" ");
        display(rot.left);
        display(rot.right);
    }
    static int size(Node rot){
        if(rot==null) return 0;
        return 1+size(rot.left)+size(rot.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(4);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println(sum(a));
        System.out.println(pro(a));
        System.out.println(maximum(a));
        System.out.println(minimum(a));
        System.out.println(size(a));
    }
}
