import java.util.Scanner;

public class SumOfParameter {
    static int sum(int n){
        if(n == 1) return 1;
        return n+sum(n-1);
    }
    static void sumparameter(int n , int s){
        if(n == 0 ){
            System.out.println("With parameter: "+s);
            return ;
        }
        sumparameter(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Without parameter: "+sum(n));
        sumparameter(n,0);
    }
}
