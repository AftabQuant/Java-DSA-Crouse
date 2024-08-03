package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeetCode102{
    static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    static void print(Node root, int n, List<Integer> arr){
        Queue<Pair> q = new ArrayDeque<>();
        if(root!=null)q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front = q.poll();
            Node temp = front.node;
            int level = front.level;
            if(level==n) arr.add(temp.val);
            if(temp.left!=null) q.add(new Pair(temp.left,level+1));
            if(temp.right!=null) q.add(new Pair(temp.right,level+1));
        }
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
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right =g;
        d.left = h;
        int len = level(a);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<len; i++){
            List<Integer> arr = new ArrayList<>();
            print(a,i,arr);
            ans.add(arr);
        }
        System.out.println(ans);
    }
}
