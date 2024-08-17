package BinaryTree;
import java.util.*;

public class rightSideView{
    static int level(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    static void preOrder(Node root, int level, List<Integer> ans){
        if(root==null) return;
        ans.set(level,root.val);
        preOrder(root.left,level+1,ans);
        preOrder(root.right,level+1,ans);
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
        a.left = b; a.right=c; b.left=d; b.right=e;
        c.left =f;c.right=g; d.left=h;d.right=i;
        List<Integer> list = new ArrayList<>();
        int lvl = level(a);
        for(int x=0; x<lvl; x++){
            list.add(0);
        }
        preOrder(a,0,list);
        System.out.println(list);
    }
}
