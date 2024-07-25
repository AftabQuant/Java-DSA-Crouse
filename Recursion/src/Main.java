import java.util.Scanner;

public class Main {
    static void increasing(int n){
        if(n == 0) return ;
        increasing(n-1);// 1 to n
        System.out.print(n+" ");
    }
    static void decreasing(int n){
        if(n == 0) return ;
        System.out.print(n+" ");
        decreasing(n-1); // n to 1
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        increasing(x);
        System.out.println();
        decreasing(x);
    }
}