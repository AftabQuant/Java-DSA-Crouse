import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class dfsIterativeApproach{
    static void preorder(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            Node temp = st.pop();
            arr.add(temp.val);
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        System.out.println(arr);
    }
    static void postOrder(Node root){
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
    static void inOrder(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        Node temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                if(st.isEmpty()) break;
                Node top = st.pop();
                ans.add(top.val);
                temp = top.right;
            }
        }
        System.out.println(ans);
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
        System.out.print("PreOrder : ");
        preorder(a);
        System.out.print("PostOrder : ");
        postOrder(a);
        System.out.print("InOrder : ");
        inOrder(a);
    }
}
