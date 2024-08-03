import java.util.*;

public class Temporary1{
    static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level=level;
        }
    }
    static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    static int size(Node root){
        if(root == null) return 0;
        return 1+ size(root.left)+ size(root.right);
    }
    static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    static void bfs(Node root){
        Queue<Node> que = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        if(root!=null) que.add(root);
        while(!que.isEmpty()){
            Node temp = que.poll();
            ans.add(temp.val);
            if(temp.left!=null) que.add(temp.left);
            if(temp.right!=null)que.add(temp.right);
        }
        System.out.println(ans);
    }
    static void nthLevel(Node root, int level, int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        nthLevel(root.left,level+1,n);
        nthLevel(root.right,level+1,n);
    }
    static void allnthLevel(Node root, int level, int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        allnthLevel(root.left,level+1,n);
        allnthLevel(root.right,level+1,n);
    }
    static void levelOrder(Node root){
        Queue<Pair> que = new ArrayDeque<>();
        List<Integer> arr = new ArrayList<>();
        if(root!=null) que.add(new Pair(root,0));
        while(!que.isEmpty()){
            Pair front = que.poll();
            Node temp = front.node;
            int leve = front.level;
            arr.add(temp.val);
            if(temp.left!=null) que.add(new Pair(temp.left,leve+1));
            if(temp.right!=null) que.add(new Pair(temp.right,leve+1));
        }
        System.out.println(arr);
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
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        bfs(a);
        levelOrder(a);
    }
}
