import java.util.Scanner;

public class rotrateArray {
    static void printArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        return ;
    }
    static void rotateInPlace(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        reverseArr(arr ,0,n-k-1);
        reverseArr(arr, n-k , n-1);
        reverseArr(arr , 0 , n-1);

    }
    static int[] rotate(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        int j=0;
        int ans[] = new int[n];
        for(int i=(n-k);i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0;i<n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    static int[] reverseArr(int ar[] , int i , int j ){
        int n = ar.length;
        while(i<j){
            int temp=ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
//        for(int i=(n-1); i>=0; i--){
//            ans[j++] = ar[i];
//        }
        return ar;
    }
    public static void main(String[] args) {
        int arr[];
        arr = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        rotateInPlace(arr,k);
        printArray(arr);
    }
}
