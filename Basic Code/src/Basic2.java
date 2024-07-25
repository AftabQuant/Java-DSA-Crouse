
import java.util.Scanner;

public class Basic2 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Your entered number is: "+(x+y));
        System.out.println("Your entered number is: "+(x-y));
        System.out.println("Your entered number is: "+(x*y));
        System.out.println("Your entered number is: "+(x/y));
        System.out.println("Your entered number is: "+(x%y));
        System.out.println("Your entered number is: "+(x==y));//false
        System.out.println("Your entered number is: "+(x!=y));//true
        System.out.println("Your entered number is: "+(x>y));//true
        System.out.println("Your entered number is: "+(x<y));//false
        System.out.println("Your entered number is: "+(x>=y));//true
        System.out.println("Your entered number is: "+(x<=y));//false
        System.out.println("Your entered number is: "+!(x==y));//true
//        System.out.println("Your entered number is: "+(x+y));
//        System.out.println("Your entered number is: "+(x+y));
    }
}
