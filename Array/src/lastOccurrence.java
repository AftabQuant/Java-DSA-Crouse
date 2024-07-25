import java.util.Scanner;
class occurren{
    int last(int ar[],int a){
        int ans =-1;
        for(int i=0; i<ar.length; i++){
            if(a == ar[i]){
                ans = ar[i+1];
            }
        }
        return ans;
    }
}
public class lastOccurrence {
    public static void main(String[] args) {
        occurren obj = new occurren();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element: ");
        int x = sc.nextInt();
        System.out.println("Enter size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(obj.last(arr,x));
    }
}
