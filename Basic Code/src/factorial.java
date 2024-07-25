import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int n= sc.nextInt();
        System.out.print("Enter the number: ");
        int r=sc.nextInt();
        int fact1=1,fact2=1,fact3=1;
        for(int i=1;i<=n;i++){
            fact1*=i;
        }
        for(int i=1;i<=r;i++){
            fact2*=i;
        }
        for(int i=1;i<=n-r;i++){
            fact3*=i;
        }
        int nCr=(fact1/(fact2*fact3));
        System.out.println("The factorial is "+nCr);
    }
}
