import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        for(int i=1;i<=num;i++){
            if(i %2 == 0){
                ans = ans-i;
            }
            else
                ans = ans+i;
        }
        System.out.println(ans);
    }
}
