package BinarySearchTree;
import java.util.*;
public class predecessorAndSuccessor{
    private static void inorder(Node root, List<Integer> arr ){
        if(root==null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    static void predecessor(Node root){
        Node prev = root.left;
        while(prev.right!=null){
            prev = prev.right;
        }
        System.out.println(prev.val);
    }
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        List<Integer> arr = new ArrayList<>();
        inorder(a,arr);
        System.out.println(arr);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==60){
                System.out.println("Predecessor : " + arr.get(i-1));
                if(i==arr.size()-1) return;
                else System.out.println("successor : " + arr.get(i+1));
                break;
            }
        }
        predecessor(a);
    }
}
