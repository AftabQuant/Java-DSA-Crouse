package Java_Decode;

import java.util.Scanner;

public class GCD{
    static int hcf(int a, int b) {
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }
    static int hcf2(int a, int b) {
        while(a%b != 0){
            int rem = a%b;
            b = a;
            a = rem;
        }
        return a;
    }
    static int hcf3(int a, int b) {
        if(b == 0) return a;
        return hcf3(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(hcf3(a,b));
    }
}
