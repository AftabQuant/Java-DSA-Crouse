class Node{
    int val;
    Node left;
    Node right;
    Node(int val){this.val=val;}
}
public class TreeNode {
    static void display(Node rot){
        if(rot==null) return;
        System.out.print(rot.val+" ");
        display(rot.left);
        display(rot.right);
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
    }
}
