package BinarySearchTree;

public class MorrisTraversal{
    static void display(Node root){
        if(root==null) return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
    static void morrisTraversal(Node cur){
        while(cur!=null){
            if(cur.left!=null){
                Node pred = cur.left;
                while(pred.right!=null && pred.right!=cur) pred = pred.right;
                if(pred.right==null){
                    pred.right = cur; 
                    cur = cur.left;
                }
                else{
                    System.out.print(cur.val+" ");
                    pred.right = null;
                    cur = cur.right;
                }
            }
            else{
                System.out.print(cur.val+" ");
                cur = cur.right;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        e.left = b; e.right = h;
        b.left = a; b.right = d; d.left = c;
        h.left = f; h.right = i; f.right = g; i.right = j;
        display(e);
        System.out.println();
        morrisTraversal(e);
    }
}
