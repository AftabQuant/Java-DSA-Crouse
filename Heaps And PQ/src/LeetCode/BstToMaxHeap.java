package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class BstToMaxHeap{
    static void inorder(Node root, List<Integer> ans){
        if(root == null) return;
        inorder(root.right, ans);
        ans.add(root.data);
        inorder(root.left, ans);
    }
    static void add(Node root, List<Integer> ans, int[] idx){
        if(root == null) return;
        root.data = ans.get(idx[0]++);
        add(root.left, ans, idx);
        add(root.right, ans, idx);
    }
    public static void convertToMaxHeapUtil(Node root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        int[] idx = {0};
        preorder(root);
        add(root, ans, idx);
    }
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {

    }
}
