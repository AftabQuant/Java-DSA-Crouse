import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[]{1,2,3,4,2,1,3};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]= -1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                count = arr[i];
            }
        }
        System.out.println(count);
    }
}
