public class NumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length, i=0, j=0, count = 0, a = i, b = j;
        for(int x = 0; x <nums.length; x++){
            nums[x] %= 2;
        }
        while(i<n && nums[i]!=1) i++;
        while (k>0 && j<n) if(nums[j++] == 1) k--;
        if(k > 0) return 0;
        j--;
        b = j+1;
        while(b<n && nums[b]!=1) b++;
        b--;
        while(b<n){
            int len = (i-a+1) * (b-j+1);
            count += len;
            a = i+1; i++;
            while(i<n && nums[a-1]!=1) a++;
            j = b+1;
            b = j+1;
            while(b < n && nums[b]!=1) b++;
            b--;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
