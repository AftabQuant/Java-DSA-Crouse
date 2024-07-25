import java.util.Scanner;

public class LCM{
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y,x%y);
    }
    static int lcm(int x, int y){
        int prod = x*y;
        return prod/gcd(x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int x = sc.nextInt();
        System.out.print("Enter any number : ");
        int y = sc.nextInt();
        System.out.println(lcm(x,y));
    }
}
