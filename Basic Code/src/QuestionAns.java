import java.util.Scanner;
public class QuestionAns{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n=sc.nextInt();
        System.out.print("Enter r number: ");
        int r=sc.nextInt();
        int nfact=1,rfact=1,nrfact=1;
        for(int i=1;i<=n;i++){
             nfact*=i;
        }
        System.out.println("The factorial is " + nfact);
//        for(int i=1;i<=r;i++){
//            rfact*=i;
//        }
//        for(int i=1;i<=(n-r);i++){
//            nrfact*=i;
//        }
//        int nCr=nfact/(rfact*nrfact);
//        System.out.println("The nCr is " +nCr);
    }
}