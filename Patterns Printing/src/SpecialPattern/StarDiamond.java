package SpecialPattern;

public class StarDiamond{
    public static void print(int n){
        int nsp = n - 1, nst = 1;
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   "); // Adjusted the spacing
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--; // Decrease spaces
            nst += 2; // Increase stars
        }
        nsp = 1; nst -= 4; // Reset for the bottom part of the diamond

        // Lower part of the diamond
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   "); // Adjusted the spacing
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp++; // Increase spaces
            nst -= 2; // Decrease stars
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
