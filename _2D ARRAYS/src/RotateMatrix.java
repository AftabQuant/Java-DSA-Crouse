import java.util.Scanner;

public class RotateMatrix {

    static void printArray(int[][] arr, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[][] arr,int r,int c){
        for(int i=0; i<r; i++){
            for(int j=i; j<c; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return;
    }
    static void rotateArray(int[][] arr, int r){
        reverseArray(arr,r,r);
        for(int i=0; i<r; i++){
            for(int j=r-1; j>=0; j--){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter colomn: ");
        int c =sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotateArray(arr,r);
    }
}
