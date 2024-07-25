package Java_Decode;

public class inversionCount{
    static int count;
    static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-(n/2)];
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n-n/2; i++) b[i] = arr[i+n/2];
        mergeSort(a);
        mergeSort(b);
        //inversion(a,b); // Another Method
        merge(a,b,arr);
    }
    static void inversion(int[] a, int[]b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                count += (a.length-1);
                j++;
            }
            else i++;
        }
    }
    static void merge(int[] a, int[] b, int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) {
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
            }
        }
        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }

    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        mergeSort(arr);
        System.out.println("Pairs are : " + count);
    }
}
