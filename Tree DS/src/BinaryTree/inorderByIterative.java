package BinaryTree;
import java.util.*;

public class inorderByIterative{
    static  List<Integer> inorder(Node root){
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
        return ans;
    }
    public static void main(String[] args) {
        Node a = new Node(1); Node b = new Node(2);
        Node c = new Node(3); Node d = new Node(4);
        Node e = new Node(5); Node f = new Node(6);
        Node g = new Node(7); Node h = new Node(8);
        Node i = new Node(9);
        a.left = b; a.right=c; b.left=d; b.right=e; c.left =f;c.right=g;
        d.left=h;d.right=i;
        List<Integer> ans = inorder(a);
        System.out.println(ans);
    }
}
