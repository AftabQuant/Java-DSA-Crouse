package SpecialPattern;
import java.util.Scanner;

public class FlippedTriangle{
    static void normal(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j  > n) System.out.print("*"+" ");
                else System.out.print("  "+" ");
            }
            System.out.println();
        }
    }
    static void compositeMethod(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int n = sc.nextInt();
        compositeMethod(n);
    }
}
