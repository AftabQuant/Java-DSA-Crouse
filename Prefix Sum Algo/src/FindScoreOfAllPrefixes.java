public class FindScoreOfAllPrefixes{
    public static long[] findPrefixScore(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int[] ar2 = new int[n];
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            ar2[i] = nums[i] + max;
        }
        long[] res = new long[n];
        res[0] = ar2[0];
        for(int i=1; i<ar2.length; i++){
            res[i] = ar2[i] + res[i-1];
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
