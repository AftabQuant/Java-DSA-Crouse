import java.util.*;
public class SelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;
        int min=0 ;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(arr[i]!=arr[min]) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        for(int i:arr){
            System.out.println(i+"\t");
        }
    }
}
