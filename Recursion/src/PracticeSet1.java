import java.util.Scanner;

public class PracticeSet1 {

    static void increasingNum(int n){
        if(n==0) return;
        increasingNum(n-1);
        System.out.print(n+"\t");
    }
    static void decreasingNum(int n){
        if(n == 0) return;
        System.out.print(n+"\t");
        decreasingNum(n-1);
    }
    static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    static void sumOfNaturalNum(int n,int s){
//        if(n == 1) return n;
//        return n + sumOfNaturalNum(n-1);
        if(n == 0) {
            System.out.print("The sum is: "+s);
            return ;
        }
        sumOfNaturalNum(n-1,s+n);
    }
    static int powerOfa(int a, int b){
//        if(b == 1) return a;
//        return a * powerOfa(a,b-1);
        if(b == 1) return a;
        int smallpow = powerOfa(a,b/2);
        if(b%2 == 0){
            return smallpow*smallpow;
        }
        else return a*smallpow*smallpow;
    }

    static int fibonacciSeries(int n){
        if(n<=2) return 1;
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }

    static int SumOfDigit(int n){
        if(n>=0 && n<=9) return n;
        return (SumOfDigit(n/10)) + n%10;
    }
    static int countOfDigit(int n){
        if(n/10 == 0) return 1;
        return countOfDigit(n/10) + 1;
    }
    static void KthTable(int n, int k){
        if(k == 0) return ;
        KthTable(n,k-1);
        System.out.print(n*k+"\t");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the number: ");
        int k = sc.nextInt();
//        System.out.print("Enter the number: ");
//        int b = sc.nextInt();
//        System.out.print("Fibonacci num of "+n+" is: "+countOfDigit(n));
//        System.out.print(n+" raised to the power "+a+" is: "+powerOfa(a,b));
//        KthTable(n,k);
    }
}
