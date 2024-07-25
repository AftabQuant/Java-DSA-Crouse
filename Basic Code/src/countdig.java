import java.util.Scanner;

public class countdig {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rem,sum=0;
        while(num!=0){
            rem = num%10;
            num=num/10;
            sum=sum+rem;
        }
        System.out.println("The num is " +sum);
    }
}
