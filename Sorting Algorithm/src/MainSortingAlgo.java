public class MainSortingAlgo {
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+"\t" );
        }
        System.out.println();
    }
    static int partition(int[] arr, int l, int r){
        int pivot = arr[0];
        int count = 0;
        for(int i=0; i<r; i++){
            if(pivot>arr[i]){
                count++;
            }
        }
        int pidx = count+l;
        swap(arr,l,pidx);
        int i=l,j=r;
        while(i<pidx && j>pidx){
            while(arr[i]<pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pidx && j>pidx){
                swap(arr,i,j);
            }
        }
        return l;
    }
    static void quickSort(int[] arr, int l, int r){
        if(l>=r) return;
        int pi = partition(arr,l,r);
        quickSort(arr,l,pi-1);
        quickSort(arr,pi+1,r);
    }
    public static void main(String[] args) {
        int[] arr = {6,1,4,3,5,2};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
