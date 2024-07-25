import java.util.Scanner;



class reverse{
    static void swapp(int ar[], int i, int j) {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    static void reVerse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swapp(arr,i,j);
            i++;
            j--;
        }
    }
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
public class ReverseUsingSwap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter size: ");
        int arr[];
        arr = new int[]{1,2,3,4,5,6};
        reverse obj = new reverse();
        obj.reVerse(arr);
        obj.printArray(arr);
    }
}
