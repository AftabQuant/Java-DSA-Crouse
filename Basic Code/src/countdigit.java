import java.util.Scanner;
public class countdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int count=0,rem,rev=0,sum=0,prod=1;
        while(num>0){
            rem=num%10;
            num/=10;
            rev=rev*10+rem;
            count++;
            sum+=rem;
            prod*=rem;
        }
        System.out.println("the count is "+ count);
        System.out.println("The reverse is "+rev);
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+prod);
    }
}
