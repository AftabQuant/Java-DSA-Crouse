public class maxAndmin{
    static int maximum(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(maximum(root.left),maximum(root.right)));
    }
    static int minimum(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(minimum(root.left),minimum(root.right)));
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(maximum(a));
        System.out.println(minimum(a));
    }
}
