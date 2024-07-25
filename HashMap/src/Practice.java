import java.util.*;
public class Practice {
    static void printArray(int[] ar){
        for(var ele : ar){
            System.out.print(ele+"\t");
        }
        System.out.println();
    }
    static void swapFunc(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void bubbleSort(int[] ar){
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(ar[j]>ar[j+1]){
                    swapFunc(ar,j,j+1);
                }
            }
        }
    }
    static void selectionSort(int[] ar){
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            int min = ar[i];
            for(int j=i+1; j<n;j++){
                if(min>ar[j]){
                    min = ar[j];
                }
            }
            if(min!=ar[i]) {
                swapFunc(ar, min, i);
            }
        }
    }
    public static void main(String[] args) {
        int[] ar = {4,1,6,5,2,3};
        selectionSort(ar);
        printArray(ar);
    }
}
