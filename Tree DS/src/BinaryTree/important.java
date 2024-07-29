package BinaryTree;

public class important{
    static int size(Node root){
        if(root == null) return 0;
        return 1+ size(root.left)+size(root.right);
    }
    static int level(Node root){
        if(root == null) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(size(a));
        System.out.println(level(a));
    }
}
