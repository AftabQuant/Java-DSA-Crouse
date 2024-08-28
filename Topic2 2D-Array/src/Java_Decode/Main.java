package Java_Decode;
import java.util.*;
public class Main {
    static void printArray(int[][] arr){
       for(int[] ele : arr){
           for(int x : ele){
               System.out.print(x+"\t");
           }
           System.out.println();
        }
        System.out.println();
    }
    static int largestElement(int[][] ar){
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                mx = Math.max(mx,ar[i][j]);
            }
        }
        return mx;
    }
    static int sumOfArray(int[][] ar){
        int sum = 0;
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                sum +=ar[i][j];
            }
        }
        return sum;
    }
    static void sumofTwoArray(int[][] a, int[][] b){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                a[i][j] +=b[i][j];
            }
        }
        printArray(a);
    }
    static int[][] transposeArray(int[][] ar){
        int[][] c = new int[ar.length][ar[0].length];
        for(int i=0; i<ar[0].length; i++){
            for(int j=0; j<ar.length; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        return ar;
    }
    static void rotateTranspose(int[][] ar){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<=i; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        printArray(ar);
    }
    static void rotate90Degree(int[][] ar){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<i; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        printArray(ar);
        for(int[] ints : ar) {
            for (int j = ar.length - 1; j >= 0; j--) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
    static void wavePrinting(int[][] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j=0; j<arr.length; j++){
                    System.out.print(arr[i][j]+"\t");
                }
            }
            else{
                for(int j=arr.length-1; j >=0; j--){
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }
    static void spiralPrinting(int[][] arr){
        int n = arr.length;
        int fr = 0, fc = 0, lr = arr.length-1, lc = arr.length-1;
        int zeros = 0;
        while(zeros<n*n){
            for(int j=fc; j<=lc;j++){
                System.out.print(arr[fr][j]+"\t");
                zeros++;
            }
            fr++;
            for(int i=fr; i<=lr; i++){
                System.out.print(arr[i][lc]+"\t");
                zeros++;
            }
            lc--;
            for(int j=lc; j>=fc; j--){
                System.out.print(arr[lr][j]+"\t");
                zeros++;
            }
            lr--;
            for(int i=lr; i>=fr; i--){
                System.out.print(arr[i][fc]+"\t");
                zeros++;
            }
            fc++;
        }
    }
    static void arrayMultiplication(int[][] arr, int[][] brr){
        int[][] crr = new int[arr.length][brr[0].length];
        for(int i=0; i<crr.length; i++){
            for(int j=0; j< crr[0].length; j++){
                for(int k=0; k<crr.length; k++){
                    crr[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }
        printArray(crr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row's number : ");
//        int r = sc.nextInt();
//        System.out.println("Enter column's number : ");
//        int c = sc.nextInt();
        int[][] arr = {{1,2,4},{3,4,5}};
        int[][] brr = {{5,6,5},{7,8,6},{5,6,7}};
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
        arrayMultiplication(arr,brr);

    }
}
