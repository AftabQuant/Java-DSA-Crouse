import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<num;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.println(+temp);
        }
    }
}
