public class Algorithm{
    public static int slidingWindow(int[] arr, int k){
        int n = arr.length;
        int i=0, j= k-1, sum = 0, max = 0;
        for(int a=0; a<k; a++){
            sum += arr[a];
        }
        max = sum;
        i++; j++;
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            max = Math.max(sum, max);
            i++; j++;
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
