public class AllSortingAlgo {
    static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void swapFunc(int[] ar, int x, int y){
        int temp = ar[x];
        ar[x] = ar[y];
        ar[y] = temp;
    }
    static void bubbleSort(int[] ar){
        int n = ar.length;
        boolean flag = false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(ar[j]>ar[j+1]) {
                    swapFunc(ar,j,j+1);
                    flag = true;
                }
            }
            if(!flag) return;
        }
        printArray(ar);
    }
    static void selectionSort(int[] ar){
        int n = ar.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if(ar[min]>ar[j]){
                    min = j;
                }
            }
            if(ar[i]!=ar[min]) swapFunc(ar,i,min);
        }
        printArray(ar);
    }
    static void insertionSort(int[] ar){
        int n = ar.length;
        for(int i=0; i<n; i++){
            for(int j=n-1; j>0; j--){
                if(ar[j-1]>ar[j]) swapFunc(ar,j-1,j);
            }
        }
        printArray(ar);
    }
    static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    static void mergeSort(int[] ar){
        int n = ar.length;
        if(ar.length == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++) a[i]=ar[i];
        for(int i=0; i<n-n/2; i++) b[i]=ar[i+n/2];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,ar);
    }
    static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo]; int count =0;
        for(int i=lo+1; i<arr.length; i++){
            if(pivot>=arr[i]) count++;
        }
        int pidx = lo+count;
        swapFunc(arr,lo,pidx);
        int i=lo,j=hi;
        while(i<pidx && j>pidx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot){
                swapFunc(arr,i,j);
                i++;j--;
            }
        }
        return pidx;
    }
    static void quickSort(int[] arr, int lo, int hi){
        if(lo>=hi) return;
        int pi = partition(arr,lo,hi);
        quickSort(arr,lo,pi-1);
        quickSort(arr,pi+1,hi);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
    }
}
