import java.util.Scanner;

public class MultiplicationOf2dArray {
    static void printArray(int arr[][], int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        return ;
    }
    static void multiplication(int[][] arr1,int r1, int c1, int[][] arr2, int r2, int c2){
        int mul[][] = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<r1; k++){
                    mul[i][j] += (arr1[i][k] * arr2[k][j]);
                 }
            }
        }
        printArray(mul,r1,c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r1 = sc.nextInt();
        System.out.print("Enter colomn: ");
        int c1 =sc.nextInt();
        int arr1[][] = new int[r1][c1];
        for(int i=0; i<r1;i++){
            for(int j=0; j<c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter row: ");
        int r2 = sc.nextInt();
        System.out.print("Enter colomn: ");
        int c2 =sc.nextInt();
        int arr2[][] = new int[r2][c2];
        for(int i=0; i<r2;i++){
            for(int j=0; j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        multiplication(arr1,r1,c1,arr2,r2,c2);
    }
}
