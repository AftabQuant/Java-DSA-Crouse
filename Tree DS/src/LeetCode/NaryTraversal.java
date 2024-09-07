package LeetCode;
import java.util.*;

public class NaryTraversal{
    public static void postOrder(Node root, List<Integer> ans){
        if(root==null) return;
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
    public static List<Integer> postorder(Node root){
        List<Integer> ans = new ArrayList<>();
        postOrder(root,ans);
        return ans;
    }
    public static void main(String[] args) {

    }
}
