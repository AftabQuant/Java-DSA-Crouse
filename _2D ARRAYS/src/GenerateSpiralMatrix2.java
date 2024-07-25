import java.util.Scanner;

public class GenerateSpiralMatrix2 {
    static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int[][] spiralmatrix(int n){
        int[][] ar = new int[n][n];
        int tr = 0, lc = 0, br = n-1, rc = n-1;
        int value=1;
        while(value <= n*n){
            for(int j=lc; j<=rc; j++){
                ar[tr][j] = value++;
            }
            tr++;
            for(int i=tr; i<=br; i++){
                ar[i][rc] = value++;
            }
            rc--;
            for(int j=rc; j>=lc; j--){
                ar[br][j] = value++;
            }
            br--;
            for(int i=br; i>=tr; i--){
                ar[i][lc] = value++;
            }
            lc++;
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        int[][] ans = spiralmatrix(n);
        printArray(ans);
    }
}
