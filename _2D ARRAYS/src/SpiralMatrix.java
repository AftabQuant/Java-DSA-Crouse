import java.util.Scanner;

public class SpiralMatrix {
    static void printArray(int [][] arr, int r, int c){
        for(int i=0; i<r;i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void spiralMAtrix(int[][] arr,int r, int c){
        int tr= 0, br= (r-1),lc= 0, rc= (c-1);
        int zero=0;
        while (zero<r*c){
//            toprow -> leftcolumn to rightcol
            for(int j=lc; j<=rc; j++){
                System.out.print(arr[tr][j]+"\t");
                zero++;
            }
            tr++;
//            rc -> tr to br
            for(int i=tr; i<=br; i++){
                System.out.print(arr[i][rc]+"\t");
                zero++;
            }
            rc--;
//            br -> rc to lc
            for(int j=rc; j>=lc; j--){
                System.out.print(arr[br][j]+"\t");
                zero++;
            }
            br--;
//            lc ->br to tr 
            for(int i=br; i>=tr; i--){
                System.out.print(arr[i][lc]+"\t");
                zero++;
            }
            lc++;
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row: ");
//        int r = sc.nextInt();
//        System.out.print("Enter colomn: ");
//        int c =sc.nextInt();
//        int[][] arr = new int[r][c];
//        for(int i=0; i<r;i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt()
        int[][] arr = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        System.out.println();
        printArray(arr,3,4);
        System.out.println();
        spiralMAtrix(arr,3,4);
    }
}
