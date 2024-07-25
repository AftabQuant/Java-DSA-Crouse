package Java_Decode;

public class SortAlgorithm {
    static void swapFunc(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void pushZeroes(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swapFunc(arr,j,j+1);
                }
                if(arr[j] == 0) count++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                ans[i] = arr[i];
            }
            else ans[i] = 0;
        }
        printArray(ans);
    }
    static void bubbleSort(int[] arr){
        boolean flag = false;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    swapFunc(arr,j,j+1);
                    flag = true;
                }
                if(!flag) return;
            }
        }
        printArray(arr);
    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
                swapFunc(arr,min,i);
            }
        }
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>=1 && arr[j-1]>arr[j]; j--){
                swapFunc(arr,j-1,j);
            }
        }
        printArray(arr);
    }
    static void transformArray(int[] arr){
        int n = arr.length;
        int x = 1;
        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int j=0; j<n; j++){
                if(min>arr[j] && arr[j]>0){
                    min = arr[j];
                    idx = j;
                }
            }
            arr[idx] = x;
            x--;
        }
        for(int i=0; i<n; i++){
            arr[i] = Math.abs(arr[i]);
        }
        printArray(arr);
    }
    static int minimumSum(int[] arr){
        selectionSort(arr);
        return arr[0]+arr[1];
    }
    public static void main(String[] args) {
        int[] arr = {54,11,28,91,47,63};
    }
}
