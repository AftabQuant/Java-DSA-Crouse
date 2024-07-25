import java.util.Scanner;

public class missingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<(arr.length-1); i++){
            arr[i] = sc.nextInt();
        }
        int ans = n*(n+1)/2;
        int sum = 0;
        for(int i=0;i<arr.length; i++){
            sum = sum+arr[i];
        }
        int fans = ans - sum;
        System.out.println("Missing element is: "+fans);
    }
}
