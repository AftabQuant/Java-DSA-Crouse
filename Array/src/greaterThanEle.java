import java.util.Scanner;
class greater{
    int count = 0;
    int greaterr(int arr[],int a){
        for(int i=0; i<arr.length; i++){
            if(arr[i] > a){
                count++;
            }
        }
        return count;
    }
}
public class greaterThanEle {
    public static void main(String[] args) {
        greater obj = new greater();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element: ");
        int x = sc.nextInt();
        System.out.println("Enter size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Count is: "+obj.greaterr(arr,x));

    }
}
