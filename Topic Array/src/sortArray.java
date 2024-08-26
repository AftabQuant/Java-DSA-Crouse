import java.util.Scanner;
public class sortArray {
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void inplaceSort(int arr[]){
    int i = 0;
    int j=(arr.length-1);
    while(i<j){
        if(arr[i] == 1 && arr[j] == 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        if(arr[i] == 0){
            i++;
        }
        if(arr[j] == 1){
            j--;
        }
    }
    }
    static void sortZeroes(int arr[]){
        int n= arr.length;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i=0;i<arr.length; i++){
            if(i < count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,0,1,0,1,0,0,1};
        inplaceSort(arr);
        printArray(arr);
    }
}
