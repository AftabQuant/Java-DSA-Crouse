import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
