import java.util.Scanner;

public class numbermod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        num+=8;
        num/=3;
        num = num%5;
        num = num*5;
        System.out.println("The result is: "+num);
    }
}
