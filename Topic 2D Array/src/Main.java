import javax.swing.*;
import java.util.Scanner;

public class Main {
    static void printArray(int arr[][], int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r=sc.nextInt();
        System.out.print("Enter colomn: ");
        int c=sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Hello world!");
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr,r,c);
    }
}