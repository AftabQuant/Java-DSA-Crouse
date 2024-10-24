import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class SpiralMatrix2 {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void spiralNum(int[][] ar, int r, int c){
        int count = 0;
        int tr = 0, lc =0, br = r-1, rc = c-1;
        while(count<r*c){
            // tr = lc to rc
            for(int j=lc; j<=rc; j++){
                System.out.print(ar[tr][j]+"\t");
                count++;
            }
            tr++;
            // rc = tr to br
            for(int i=tr;i<=br; i++){
                System.out.print(ar[i][rc]+"\t");
                count++;
            }
            rc--;
            // br = rc to lc
            for(int j=rc; j>=lc; j--){
                System.out.print(ar[br][j]+"\t");
                count++;
            }
            br--;
            // lc = br to tr
            for(int i=br; i>=tr; i--){
                System.out.print(ar[i][lc]+"\t");
                count++;
            }
            lc++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row num : ");
        int r = sc.nextInt();
        System.out.print("Enter col num : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        spiralNum(arr,r,c);
    }
}
