package SpecialPattern;

public class Pyramid{
    static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* "+" ");
            }
            System.out.println();
        }
        int nsp = n-1;
        int nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("   "+" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* "+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
