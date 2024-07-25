import java.util.Scanner;

public class subarrayEqual {
    static int totalSum(int arr[]){
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean subArray(int arr[]){
        int totalsum= totalSum(arr);
        int prefsum = 0;
        for (int i=0; i<arr.length;i++){
            prefsum +=arr[i];
            int sufsum = totalsum-prefsum;
            if(sufsum == prefsum){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(subArray(arr));
    }
}
