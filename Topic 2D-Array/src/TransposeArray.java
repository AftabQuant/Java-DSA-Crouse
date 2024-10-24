import java.util.Scanner;

public class TransposeArray {
    static void printArray(int[][] arr, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void transposeArray(int[][] arr, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
    }
    static void transposeInplace(int[][]arr,int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row num: ");
        int r = sc.nextInt();
        System.out.print("Enter the col num: ");
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr,r,c);
        System.out.println();
        transposeInplace(arr,r,c);
        printArray(arr,r,c);
    }
}
