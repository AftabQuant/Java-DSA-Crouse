import java.util.Scanner;

public class KthTable {
    static void table(int n, int k){
        if(k == 0) return ;
        table(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        table(n,k);
    }
}
