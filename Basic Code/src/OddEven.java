import java.sql.SQLOutput;
import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int x=sc.nextInt();
        String result;
        result = (x%3==0 || x%5==0)?"True":"False";
        System.out.println(result);
    //    int y=sc.nextInt();

    }
}