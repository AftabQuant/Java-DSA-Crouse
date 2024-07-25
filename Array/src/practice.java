import java.util.Scanner;


public class practice {
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void rotateArray(int arr[],int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int x = sc.nextInt();
        System.out.print("Enter rotate number: ");
        int k = sc.nextInt();
        k=k%x;
        int arr[] = new int[x];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        rotateArray(arr,0,x-1);
        rotateArray(arr,0,k-1);
        rotateArray(arr,k,x-1);
        printArray(arr);
    }
}
