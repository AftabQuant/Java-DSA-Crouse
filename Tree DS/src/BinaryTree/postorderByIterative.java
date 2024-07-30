package BinaryTree;
import java.util.*;

public class postorderByIterative{
    public static void main(String[] args) {
        Node a = new Node(1); Node b = new Node(2);
        Node c = new Node(3); Node d = new Node(4);
        Node e = new Node(5); Node f = new Node(6);
        Node g = new Node(7); Node h = new Node(8);
        Node i = new Node(9);
        a.left = b; a.right=c; b.left=d; b.right=e; c.left =f;c.right=g;
        d.left=h;d.right=i;
        preorder(a);
        List<Integer> ans = postorder(a);
        System.out.println(ans);
    }
    private static void preorder(Node a){
        Stack<Node> st = new Stack<>();
        if(a!=null) st.push(a);
        while(!st.isEmpty()){
            Node temp = st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        System.out.println();
    }
    private static List<Integer> postorder(Node a) {
        Stack<Node> st = new Stack<>();
        List<Integer> arr = new ArrayList<>();
        if (a != null) st.push(a);
        while (!st.isEmpty()) {
            Node temp = st.pop();
            arr.add(temp.val);
            if (temp.left != null) st.push(temp.left);
            if (temp.right != null) st.push(temp.right);
        }
        Collections.reverse(arr);
        return arr;
    }
}
