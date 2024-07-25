import java.util.Scanner;

public class Main {
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
    static boolean linearSearch(int[] arr, int x){
        for (int j : arr) {
            if (j == x) return true;
        }
        return false;
    }
    static boolean binarySearch(int[] arr, int x){
        int lo=0, hi=arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==x) return true;
            else if(arr[mid]>x) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean flag = false;
        for(int i=0; i<n-1; i++){
            flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swapFunc(arr,j,j+1);
                }
                flag=true;
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
                if(arr[j]<arr[min]){
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
                if(arr[j]<arr[j-1]) swapFunc(arr,j,j-1);
            }
        }
        printArray(arr);
    }
    static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        System.arraycopy(arr, 0, a, 0, n / 2);
        for(int j=0; j<n-n/2; j++) b[j]=arr[j+n/2];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];
        int count=0;
        for(int i=lo+1; i<arr.length; i++){
            if(arr[i]<=pivot) count++;
        }
        int pidx = lo+count;
        swapFunc(arr,lo,pidx);
        int i=0, j=hi;
        while(i<pidx && j>pidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot) swapFunc(arr,i,j);
        }
        return pidx;
    }
    static void quickSort(int[] arr, int lo, int hi){
        if(hi<=lo) return;
        int pi = partition(arr,lo,hi);
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}