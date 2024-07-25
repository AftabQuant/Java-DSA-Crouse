public class QuickSort {
    static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static void display(int[] arr){
        for(int i : arr){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    static int partition(int[] arr, int l, int r){
        int pivot = arr[l];
        int count = 0;
        for(int i=l+1; i<=r; i++){
            if(pivot >= arr[i]){
                count++;
            }
        }
        int pidx = count+l;
        swap(arr,pidx,l);
        int i = l, j = r;
        while(i<pidx && j>pidx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j){
                swap(arr,i,j);
            }
        }
        return pidx;
    }
    static void quickSort(int[] arr, int l, int r){
        if(l>=r) return ;
        int pi = partition(arr,l,r);
        quickSort(arr,l,pi-1);
        quickSort(arr,pi+1,r);
    }
    public static void main(String[] args) {
        int[] arr = { 3,2,1,5,4};
        quickSort(arr,0,arr.length-1);
        display(arr);
    }
}
