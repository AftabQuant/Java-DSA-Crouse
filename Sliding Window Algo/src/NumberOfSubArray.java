public class NumberOfSubArray{
    public static int numOfSubarrays(int[] arr, int k, int threshold){
        int i=0, j=k-1, sum = 0;   int ans = 0;
        for(int a=0; a<k; a++){
            sum += arr[a];
        }
        if(sum/k >= threshold) ans++;
        i++; j++;
        while(j < arr.length){
            sum = sum - arr[i-1] + arr[j];
            int avg = sum / k;
            if(avg >= threshold) ans++;
            i++; j++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
