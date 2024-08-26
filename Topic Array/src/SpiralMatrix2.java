import java.util.Scanner;

public class SpiralMatrix2{
    static void printA(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
        public static int[][] generateMatrix(int n) {
            int[][] ans = new int[n][n];
            int lc = 0, rc = n-1, tr = 0, br = n-1;
            int zero = 0;
            int idx = 1;
            while(zero<n*n){
                for(int j=lc; j<=rc; j++){
                    ans[tr][j] = ans[tr][idx];
                    idx++;
                    zero++;
                }
                tr++;
                for(int i=tr; i<=br; i++){
                    ans[i][rc] = ans[idx++][rc];
                    zero++;
                }
                rc--;
                for(int j=rc; j>=lc; j--){
                    ans[br][j] = ans[br][idx++];
                    zero++;
                }
                br--;
                for(int i=br; i>=tr; i--){
                    ans[i][lc] = ans[idx++][lc];
                    zero++;
                }
                lc++;
            }
            return ans;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =  generateMatrix(n);
        printA(arr);
    }
}
