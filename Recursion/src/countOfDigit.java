import java.util.Scanner;

public class countOfDigit{
    static int totalcount(int n){
        if(n/10 == 0)  return 1;
        return 1+totalcount(n/10);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    System.out.println(totalcount(n));
    }
}
