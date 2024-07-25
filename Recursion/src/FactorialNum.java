import java.util.Scanner;

public class FactorialNum {
    static int factorialNum(int n){
        if(n==1 || n==0) return 1;
        return  n *factorialNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int ans =1;
        for(int i=1; i<=x; i++){
            ans *= i;
        }
        System.out.println(ans);
        System.out.println();
        System.out.println(factorialNum(x));
    }
}
