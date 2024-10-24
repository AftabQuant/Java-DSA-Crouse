import java.util.*;

public class RectangularMatrix {
    static int worstCase(int[][] arr,int r1, int r2, int c1, int c2){
        int sum=0;
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    static int betterCase(int[][] arr, int r1, int r2, int c1, int c2){
        int sum=0;
        for(int i=r1; i<=r2; i++){
            sum += arr[i][c2] - arr[i][r1-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter colomn: ");
        int c =sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter values : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int ans = worstCase(arr,r1,r2,c1,c2);
        System.out.println("Sum is: "+ans);
        int ans2 = worstCase(arr,r1,r2,c1,c2);
        System.out.println("Sum is: "+ans2);
    }
}
