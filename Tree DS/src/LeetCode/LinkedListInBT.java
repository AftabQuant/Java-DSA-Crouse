package LeetCode;

import java.util.ArrayList;
import java.util.List;

class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class LinkedListInBT{
    public static void preOrder(TreeNode root, List<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
    public static boolean isSubPath(ListNode head, TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        preOrder(root, arr);
        while(head!=null){
            brr.add(root.val);
            head = head.next;
        }
        if(arr.contains(brr)) return true;
        else return false;
    }
    public static void main(String[] args) {
    }
}
