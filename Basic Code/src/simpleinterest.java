import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principle=sc.nextInt();
        System.out.print("Enter thee rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the year: ");
        int time= sc.nextInt();
        float SI=(principle*rate*time)/100;
        System.out.println("The simple interest is : " +SI);
    }
}
