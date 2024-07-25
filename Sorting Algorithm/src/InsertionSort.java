import java.util.*;
public class InsertionSort {
    static void insertionSort(int[] ar){
        int n = ar.length;
        for(int i=1; i<n; i++){
            for(int j=i;j>0;j--){
                if(ar[j]<ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[6];
        for(int i=0; i<6; i++){
            ar[i] = sc.nextInt();
        }
        insertionSort(ar);
        for(int val : ar){
            System.out.print(val+"\t");
        }
    }
}
