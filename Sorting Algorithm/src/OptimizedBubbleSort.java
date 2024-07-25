import java.util.*;
public class OptimizedBubbleSort {
    static void bubbleSort(int[] ar){
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                    flag = true;
                }
                if(!flag) return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
