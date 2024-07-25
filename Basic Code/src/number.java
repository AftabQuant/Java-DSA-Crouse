import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=0;
        for(int i=1;i<=x;i++){
            if((i&1)==0){
                ans=ans-i;
            }
            else
                ans=ans+i;
        }
        System.out.println(+ ans);
    }
}
