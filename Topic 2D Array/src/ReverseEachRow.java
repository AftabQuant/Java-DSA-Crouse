import java.util.Scanner;

public class ReverseEachRow {
    static void printArray(int[][] arr,int r, int c){
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int[][] arr,int r,int c){
        printArray(arr,r,c);
        System.out.println();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    static int sumOfAllElement(int[][] arr,int r,int c){
        int sum=0;
        for(int i=0; i<r; i++){
            for(int j=c-1; j>=0; j--){
                sum +=arr[i][j];
            }
        }
        return sum;
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
        reverseArray(arr,r,c);
        int ans =sumOfAllElement(arr,r,c);
        System.out.println("Sum is: "+ans);
    }
}
