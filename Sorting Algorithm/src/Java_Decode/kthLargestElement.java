package Java_Decode;

public class kthLargestElement{
    static int ans ;
    static void swapFunc(int[] ar, int x, int y){
        int temp = ar[x];
        ar[x] = ar[y];
        ar[y] = temp;
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
    static void quickSort(int[] arr, int lo, int hi,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo == k-1) ans = arr[lo];
            return;
        }
        int pi = partition(arr,lo,hi);
        if(pi==k-1) ans = arr[pi];
        if(k-1<pi)quickSort(arr,lo,pi-1,k);
        else quickSort(arr,pi+1,hi,k);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6};
        quickSort(arr,0,arr.length-1,4);
        System.out.println(ans );
    }
}
