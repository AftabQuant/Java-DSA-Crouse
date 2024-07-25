package Java_Decode;

public class basicsSort{
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void swapFunc(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean flag = false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swapFunc(arr,j,j+1);
                    flag = true;
                }
            }
            if(!flag) return;
        }
        printArray(arr);
    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swapFunc(arr,min,i);
        }
        printArray(arr);
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swapFunc(arr,j,j-1);
                }
            }
        }
        printArray(arr);
    }
    static int[] mergeTwoSortedArray(int[] arr, int[] brr){
        int n = arr.length;
        int m = brr.length;
        int[] crr = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(arr[i]>brr[j]) crr[k++] = brr[j++];
            else crr[k++] = arr[i++];
        }
        while(j<m){
            crr[k++] = brr[j++];
        }
        while(i<n){
            crr[k++] = arr[i++];
        }
        return crr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7};
        int[] brr = {4,5,8};
        int[] crr = mergeTwoSortedArray(arr,brr);
        printArray(crr);
    }
}
