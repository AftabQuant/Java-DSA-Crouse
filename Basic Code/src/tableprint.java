import java.util.Scanner;
public class tableprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int table=sc.nextInt();
        int a=1;
        for(int i=1;i<=table;i++){
            a=a*2;
            System.out.println(a);
        }
        }
}
