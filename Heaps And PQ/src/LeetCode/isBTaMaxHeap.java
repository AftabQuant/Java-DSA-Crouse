package LeetCode;

public class isBTaMaxHeap{
    static boolean isMaxH(Node root){
        if(root == null) return true;
        if(root.left != null){
            if(root.data <= root.left.data) return false;
        }
        if(root.right != null){
            if(root.data <= root.right.data) return false;
        }
        return isMaxH(root.left) && isMaxH(root.right);
    }
    static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    static boolean isCBT(Node root, int i, Integer n){
        if(root == null) return true;
        if(i>=n) return false;
        return isCBT(root.left, 2*i+1, n) && isCBT(root.right, 2*i +2, n);

    }
    static boolean isMaxHeap(Node root){
        int n = size(root);
        return isMaxH(root) && isCBT(root, 0, n);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        System.out.println(isMaxHeap(a));
    }
}
