package BinaryTree;

import java.util.Scanner;

public class nthLevelPrint{
    static int n;
    private static void printEle(Node root, int level){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        printEle(root.left,level+1);
        printEle(root.right,level+1);
    }
    private static void dfs(Node root, int level){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        printEle(root.left,level+1);
        printEle(root.right,level+1);
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
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        for(int x=0; x<4; x++){
            n = x;
            dfs(a,0);
            System.out.println();
        }
    }
}
