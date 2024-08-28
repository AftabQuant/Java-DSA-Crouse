public class nonDecreasingArray {
    static int[] decreasingArray(int arr[]) {
        int left = 0;
        int n = arr.length;
        int right = (n - 1);
        int ans[] = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    static void printArray(int arr[]){
        for(int i=(arr.length-1); i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{-10,-5,-4,1,2,9};
        int ans[] = decreasingArray(arr);
        printArray(ans);
    }
}
