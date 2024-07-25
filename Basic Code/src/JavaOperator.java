import java.util.Scanner;

public class JavaOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        float x =sc.nextFloat();
        float y =sc.nextFloat();
        System.out.println("The s is: "+ (x+=y));
        System.out.println("The s is: "+ (x-=y));
        System.out.println("The m is: "+ (x*=y));
        System.out.println("The d is: "+ (x/=y));
    }
}
