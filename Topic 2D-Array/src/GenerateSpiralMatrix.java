import java.util.Scanner;

public class GenerateSpiralMatrix {
    static void printArray(int [][] arr, int n){
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int[][] spiralMAtrix(int n){
        int[][] arr = new int[n][n];
        int tr= 0, br= (n-1),lc= 0, rc= (n-1);
        int value=1;
        while (value<=n*n){
            for(int j=lc; j<=rc; j++){
                arr[tr][j]=value++;
            }
            tr++;
            for(int i=tr; i<=br; i++){
                arr[i][rc]=value++;
            }
            rc--;
            for(int j=rc; j>=lc; j--){
                arr[br][j]=value++;
            }
            br--;
            for(int i=br; i>=tr; i--){
                arr[i][lc]=value++;
            }
            lc++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int[][] arr = spiralMAtrix(n);
        printArray(arr,n);
    }
}
