import java.util.Scanner;

public class addtwonum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int num_1 = sc.nextInt();
        int num_2=sc.nextInt();
        int sum = num_1+num_2;
        System.out.println("The sum is "+sum);
    }
}
