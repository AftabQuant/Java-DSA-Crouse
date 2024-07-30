package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class dfsLevelByLevel{
     public static class pair{
        Node node;
        int level;
        pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void dfsLByLUsingQueue(Node root){
         int idx = 0;
        Queue<pair> que = new ArrayDeque<>();
        if(root!=null) que.add(new pair(root,0));
        while(!que.isEmpty()){
            pair front = que.poll();
            Node temp = front.node;
            int level = front.level;
            if(idx!=level){
                System.out.println();
                idx++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null)que.add(new pair(temp.left,level+1));
            if(temp.right!=null)que.add(new pair(temp.right, level+1));
        }
    }
    public  static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static void dfsUsingLevel(Node root, int x, int lvl){
        if(root==null) return;
        if(x==lvl) System.out.print(root.val+" ");
        dfsUsingLevel(root.left,x+1,lvl);
        dfsUsingLevel(root.right,x+1,lvl);
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
        a.left = b; a.right=c;
        b.left=d; b.right=e;
        c.left =f;c.right=g;
        d.left=h;d.right=i;
        int lv = level(a);
        dfsLByLUsingQueue(a);
    }
}
