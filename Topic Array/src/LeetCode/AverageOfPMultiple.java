package LeetCode;

import java.util.Scanner;

public class AverageOfPMultiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiple Number: ");
        int x = sc.nextInt();
        System.out.print("Enter the Length Number: ");
        int k = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=k; i++){
            sum+=i * x;
        }
        System.out.println(sum/k);
    }
}
