package SpecialPattern;

import java.util.Scanner;

public class FlippedTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                for(int k=1; k<=j; k++){
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
