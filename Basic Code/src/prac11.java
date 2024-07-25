import java.util.Scanner;

public class prac11{
    static void OddEven(int x){
        if(x%2 == 0) {
            System.out.println( "Your given "+ x +" number is EVEN");
        }
        else{
            System.out.println("Your given "+ x +" number is ODD");
        }
    }
    static int countDigit(int x){
        int count = 0,sum = 0 , rev = 0;
        while(x > 0){
            int rem = x%10;
            sum +=rem;
            rev = rev*10+rem;
            x /=10;
            count++;
        }
        System.out.println(sum);
        System.out.println(rev);
        return count;
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        OddEven(x);
        System.out.println(countDigit(x));
    }
}
