package BinarySearchTree;

public class reverseBST{
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
    }
    private static void display(Node root){
        if(root==null) return;
        display(root.right);
        System.out.print(root.val+" ");
        display(root.left);
    }
}
