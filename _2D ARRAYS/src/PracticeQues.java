import java.util.*;
public class PracticeQues {
    static int[][] SumOfArray(int[][] arr,int[][] brr){
        int[][] crr = new int[arr.length][brr.length];
        for(int i=0; i <arr.length; i++){
            for(int j=0; j<brr.length; j++){
                crr[i][j] = arr[i] [j]+brr[i][j];
            }
        }
        return crr;
    }
    static int[][] mulOfArray(int[][] arr,int[][] brr){
        int[][] crr = new int[arr.length][brr.length];
        for(int i=0; i <arr.length; i++){
            for(int j=0; j<brr.length; j++){
                for(int k=0; k<arr.length; k++){
                    crr[i][j] += arr[i][k]*brr[k][j];
                }
            }
        }
        return crr;
    }
    static void transposeAr(int[][] ar){
        for(int i=0; i<ar.length; i++){
            for(int j=i; j<ar.length; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
    }
    static void reverseAr(int[] ar){
        for(int i=ar.length-1; i>=0; i--){
            System.out.print(ar[i]+"\t");
        }
        System.out.println();
    }
    static void rotateAr(int[][] ar){
        transposeAr(ar);
        for(int i=0; i< ar.length; i++){
            reverseAr(ar[i]);
        }
    }
    static void printArray(int[][] ar){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[i].length; j++){
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static int[][] pascalTriangle(int n){
        int[][] pas = new int[n][];
        for(int i=0; i<n; i++){
            pas[i] = new int[i+1];
            pas[i][0] = pas[i][i] = 1;
            for(int j=1; j<i; j++){
                pas[i][j] = pas[i-1][j]+pas[i-1][j-1];
            }
        }
        return pas;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row num : ");
        int n = sc.nextInt();
        int[][] ans = pascalTriangle(n);
        printArray(ans);
    }
}
