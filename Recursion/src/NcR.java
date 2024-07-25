import java.util.Scanner;

public class NcR {
    static int factorial(int x){
        if(x == 1) return 1;
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int dif = (n-r);
        int ans = (factorial(n)*factorial(r))/factorial(dif);
        System.out.print("The gcd is: "+ans);
    }
}
