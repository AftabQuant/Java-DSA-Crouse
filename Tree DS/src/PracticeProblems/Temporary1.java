package PracticeProblems;

import java.util.*;

public class Temporary1{
    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    static void bfs(Node root){
        Queue<Node> q = new ArrayDeque<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        System.out.println();
    }
    static void nThLevel(Node root, int lvl, int n){
        if(root==null) return;
        if(lvl==n) System.out.print(root.val+" ");
        nThLevel(root.left,lvl+1,n);
        nThLevel(root.right,lvl+1,n);
    }
    static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    static void preIterative(Node root){
        Stack<Node> st = new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node temp = st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        System.out.println();
    }
    static void postIterative(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node temp = st.pop();
            arr.add(temp.val);
            if(temp.left!=null) st.push(temp.left);
            if(temp.right!=null) st.push(temp.right);
        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
    static void inIterative(Node root){
        Stack<Node> st = new Stack<>();
        while(true){
            if(root!=null){
                st.push(root);
                root = root.left;
            }
            else{
                if(st.isEmpty()) break;
                Node temp = st.pop();
                System.out.print(temp.val+" ");
                root = temp.right;
            }
        }
    }
    static void rightSideView(Node root){
        if(root==null) return;
        System.out.print(root.val+ " ");
        rightSideView(root.right);
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
        c.left = f; c.right = g; g.left = h;
        System.out.print("Pre order : ");
        preOrder(a);
        System.out.println();
        preIterative(a);
        System.out.print("InOrder : ");
        inOrder(a);
        System.out.println();
        inIterative(a);
        System.out.println();
        System.out.print("Post Order : " );
        postOrder(a);
        System.out.println();
        postIterative(a);
        System.out.print("Level Order Traversal : ");
        bfs(a);
        System.out.println("nTh Level Printing : ");
        for(int i=0; i<4; i++){
            nThLevel(a,0,i);
            System.out.println();
        }
        System.out.println("Level is : " + level(a));
        rightSideView(a);
    }
}
