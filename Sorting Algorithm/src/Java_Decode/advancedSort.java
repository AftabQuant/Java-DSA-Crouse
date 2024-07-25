package Java_Decode;

public class advancedSort{
    static void swapFunc(int[] ar, int x, int y){
        int temp = ar[x];
        ar[x] = ar[y];
        ar[y] = temp;
    }
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-(n/2)];
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n-n/2; i++) b[i] = arr[i+n/2];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    static void merge(int[] a, int[] b, int[] arr){
        int count =0;
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) {
                arr[k++] = a[i++];
                count++;
            }
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
        System.out.println(count);
    }
    static void sort0sand1s(int[] arr){
        int i = 0;
        int j=(arr.length-1);
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0) {
                swapFunc(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
        printArray(arr);
    }
    static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];
        int count = 0;
        for(int i = lo+1; i < arr.length; i++) {
            if(pivot>=arr[i]) count++;
        }
        int pIdx = count+lo;
        swapFunc(arr,lo,pIdx);
        int i=lo,j=hi;
        while(i<pIdx && j>pIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot){
                swapFunc(arr,i,j);
                i++;j--;
            }
        }
        return pIdx;
    }
    static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
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
