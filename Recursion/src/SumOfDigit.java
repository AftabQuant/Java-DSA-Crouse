import java.util.Scanner;

public class SumOfDigit {
    static int sumofdigit(int n){
        if(n >= 0 && n<=9) return n;
        return sumofdigit(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(sumofdigit(n));
        int rem = 0;
        int sum = 0;
        int count=0;
        while(n>0){
            rem = n%10;
            n = n/10;
            count++;
            sum +=rem;
        }
        System.out.println(sum);
        System.out.println(count);
//        System.out.println(sumofdigit(n));
    }
}
