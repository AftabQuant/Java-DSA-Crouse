package BinarySearchTree;
import java.util.*;
public class flattenBtToLL{
    static void preOrder(Node root, List<Node> ans){
        if(root==null) return;
        ans.add(root);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
    private static void flatten(Node root){
        if(root==null) return;
        if(root.left==null && root.right ==null) return;
        Node lst = root.left;
        Node rst = root.right;
        flatten(lst);
        flatten(rst);
        root.left = null;
        root.right = lst;
        Node temp = root;
        while(temp.right!=null) temp = temp.right;
        temp.right = rst;
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
        List<Node> ans = new ArrayList<>();
        preOrder(a,ans);
        for(int x=0; x<ans.size(); x++){
            if(x!=ans.size()-1) ans.get(x).right = ans.get(x + 1);
            ans.get(x).left = null;
        }
    }
}
