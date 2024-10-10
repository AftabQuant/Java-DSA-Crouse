import java.util.Stack;

public class MaxWidthRamp{
    public int MaxWidthRamp(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j = n-1; j>i; j--){
                if(nums[i] <= nums[j]){
                    int ans = j - i;
                    max = Math.max(ans, max);
                }
            }
        }
        return max;
    }
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.isEmpty() || nums[st.peek()] >= nums[i]){
                st.push(i);
            }
        }
        for(int j= n-1; j>=0; j--){
            while(!st.isEmpty() && nums[st.peek()] <= nums[j]){
                max = Math.max(max,j - nums[st.pop()]);
            }
            if(st.isEmpty()) return max;
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
