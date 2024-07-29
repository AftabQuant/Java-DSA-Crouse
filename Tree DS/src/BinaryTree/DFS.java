package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class DFS{
    private static void levelTraversal(Node root){
        Queue<Node> que = new ArrayDeque<>();
        if(root!=null) que.add(root);
        while(!que.isEmpty()){
            Node front = que.poll();
            System.out.print(front.val+" ");
            if(front.left!=null) que.add(front.left);
            if(front.right!=null) que.add(front.right);
        }
        System.out.println();
    }
    private static void rightToLeft(Node root){
        Queue<Node> que = new ArrayDeque<>();
        if(root!=null) que.add(root);
        while(!que.isEmpty()){
            Node front = que.poll();
            System.out.print(front.val+" ");
            if(front.right!=null) que.add(front.right);
            if(front.left!=null) que.add(front.left);
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
        a.left = b; a.right=c;
        b.left=d; b.right=e;
        c.left =f;c.right=g;
        d.left=h;d.right=i;
        levelTraversal(a);
        rightToLeft(a);
    }
}
