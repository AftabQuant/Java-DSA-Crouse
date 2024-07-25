package Java_Decode;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        System.out.println(str.length());
    }
}
