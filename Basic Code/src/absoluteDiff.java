import java.util.Scanner;

public class absoluteDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{5,10,15,20,26};
        System.out.println("enter number: ");
        int x = sc.nextInt();
        int ans = 0;
        for(int i =0;i<arr.length; i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[j] - arr[i] == x){
                    ans = arr[j] - arr[i];
                    break;
                }
            }
        }
        if(ans == x){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
