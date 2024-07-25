import java.util.Scanner;
public class primeornot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        if(x>0 && x<9){
            System.out.println("The number is prime");
        }
        else System.out.println("Not prime");
    }
}
