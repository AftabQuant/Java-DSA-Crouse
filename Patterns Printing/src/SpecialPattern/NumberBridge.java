package SpecialPattern;

public class NumberBridge {
    private static void rhombus(int n){
        int a = n /2 +1;
        for(int i=1; i<=2*n-1; i++){
            System.out.print(i+"  ");
        }
        System.out.println();
        int nsp = n-1, nst = 1;
        for(int i=1; i<n; i++){
            int x = 1;
            for(int j=1; j<=nsp; j++){
                System.out.print(x+++"  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("  "+"  ");
                x++;
            }
            for(int j=n; j<n+n-i; j++){
                System.out.print(x++ +"  ");
            }
            System.out.println();
            nsp--; nst += 2; a++;
        }
    }

    public static void main(String[] args) {
        rhombus(4);
    }
}
