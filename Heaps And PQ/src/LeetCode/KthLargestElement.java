package LeetCode;

import java.util.PriorityQueue;

public class KthLargestElement{
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int j : nums) {
            pq.add(j);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {10,2,3,8,-4,-2,6};
        int k = 3;
        System.out.println(findKthLargest(arr,k));
    }
}
