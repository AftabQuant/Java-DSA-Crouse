package SpecialPattern;

import java.util.Scanner;

public class StarPlus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int n = sc.nextInt();
        int md = n/ 2 +1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==md || j==md) {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
