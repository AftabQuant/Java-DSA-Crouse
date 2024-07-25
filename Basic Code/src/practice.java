import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("hello world");
        System.out.println(+ (x+y));
        for(int i=1;i<=x+y;i++){
            if((i&1)==0) {
                System.out.println( "odd "+i);
            }
        }
    }
}
