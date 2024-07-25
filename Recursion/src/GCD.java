import java.util.*;

public class GCD {
    static int gcd(int x, int y){
        if( y == 0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        int gcd = 0,rem;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
        }
        System.out.println("Brute case of GCD: " +gcd);
        while (x%y != 0){
            rem = x%y;
            x = y;
            y = rem;
        }
        System.out.println("Using Eulid's Algorithm: "+y);
        int ans = gcd(x,y);
        System.out.println("Using recursion: "+ans);
//        int lcm = (x*y)/gcd(x,y);
//        System.out.println(lcm);
    }
}
