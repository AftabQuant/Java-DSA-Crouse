public class RadixSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr,int place){
        int n = arr.length;
        int[] freq = new int[10];
        int[] output = new int[n];
        for(int i=0; i<arr.length; i++){
            freq[(arr[i]/place)%10]++;
        }
        for(int i=1; i<freq.length; i++){
            freq[i] +=freq[i-1];
        }
        for(int i=n-1; i>=0; i--){
            int idx = freq[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            freq[(arr[i]/place)%10]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr){
        int max = findMax(arr);
        for(int place=1; max/place>0; place*=10){
            countSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr ={43,459,894,0,3};
        radixSort(arr);
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
