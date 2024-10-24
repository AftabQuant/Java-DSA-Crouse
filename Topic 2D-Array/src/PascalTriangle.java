import java.util.Scanner;
public class PascalTriangle {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int r){
        int[][] arr = new int[r][];
        for(int i=0; i<r; i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j] =arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        int[][] ans = pascal(r);
        printArray(ans);
    }
}
