import java.util.Scanner;
public class ARaisedToPowerB {
    static int power(int a, int b){
        if(b == 0 || b==1) return a;
        return a * power(a,b-1);
    }
    static int pow(int a, int b){
        if(b == 0) return 1;
        int smallpow = pow(a,b/2);
        if(b%2 == 0) return smallpow*smallpow;
        else return smallpow*smallpow*a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=b;i++){
            ans *=a;
        }
        System.out.println("The ans is: "+ans);
        System.out.println("The ans using recursion is: "+power(a,b));
        System.out.println("The ans using recursion is: "+pow(a,b));
    }
}
