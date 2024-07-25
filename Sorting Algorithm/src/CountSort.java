public class CountSort {
    static int maxfun(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length ;i++){
            if(mx<arr[i]){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basiccountSort(int[] arr){
        int max = maxfun(arr);
        int[] freq = new int[max+1];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        int k=0;
        for(int i=0; i<freq.length; i++){
            for(int j = 0; j< freq[i]; j++){
                arr[k++] = i;
            }
        }
    }
    static void countSort(int[] arr){
        int n = arr.length;
        int max = maxfun(arr);
        int[] output = new int[n];
        int[] freq = new int[max+1];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i=1; i<freq.length; i++){
            freq[i] +=freq[i-1];
        }
        for(int i=n-1;i>=0; i--){
            int idx = freq[arr[i]]-1; // from frequency array
            output[idx] = arr[i];
            freq[arr[i]]--;
        }
        for(int i=0; i<n; i++){
            arr[i]=output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2};
        countSort(arr);
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
