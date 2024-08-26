package TreeSetAndTreeMap;

public class MissingElement{
    // Method 1
    public static int missingNumber(int[] nums) {
        int[] freq = new int[nums.length+1];
        for(int i=0; i<nums.length-1; i++){
            freq[nums[i]]++;
        }
        for(int i=1; i<=freq.length; i++){
            if(freq[i]==0) return i;
        }
        return -1;
    }
    // Method 2
    public static int missingNum(int[] arr){
        int sum =0; int n = arr.length;
        for(int i=0; i<arr.length-1; i++){
            sum +=arr[i];
        }
        int rem = (n*(n+1))/2;
        return  rem-sum;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        System.out.println(missingNum(arr));
    }
}
