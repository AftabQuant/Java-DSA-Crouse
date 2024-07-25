import java.util.Scanner;
class input{
    void inputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=(arr.length-1);i>=0;i--){
            System.out.println(arr[i]);
        }
        return;
}
public class reverseArray {
//    static void inputArray(int arr[]){
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//    int j=0;
//        for(int i=(arr.length-1);i>=0;i--){
//            arr[j++] =arr[i]
//        }
//        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int siz = sc.nextInt();
        int arr[] = new int[siz];
        input obj = new input();
        obj.inputArray(arr);
    }
}
