import java.util.Scanner;

public class booleanChecked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
