import java.util.Scanner;
class person{
    Scanner sc= new Scanner(System.in);
    String name= sc.nextLine();
   // Scanner sc= new Scanner(System.in);
    int roll=sc.nextInt();
    int age=sc.nextInt();
}
public class object {
    public static void main(String[] args){
        System.out.println("Enter our name: ");
        System.out.println("Enter your roll: ");
        System.out.println("Enter your age: ");
        person obj1=new person();
        System.out.println("our name "+obj1.name);
        System.out.println(obj1.roll);
        System.out.println(obj1.age);
    }
}
