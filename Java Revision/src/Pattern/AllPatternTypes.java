package Pattern;

public class AllPatternTypes{
    static void triangle(int rows){
        for(int i=0; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
//                if(i%2 == 0) System.out.print(i+" ");
//                else System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void reverseTriangle(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void stringPattern(int rows){
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                if(i%2 == 0) System.out.print(j+" ");
                else System.out.print((char) (j+65)+" ");
            }
            System.out.println();
        }
    }
    static void oddNumTriangle(int rows){
        for(int i=1; i<=rows; i++){
                for (int j = 1; j <=i; j++) {
                    System.out.print(2*j-1 + " ");
                }
                System.out.println();
        }
    }
    static void floydTriangle(int rows){
        int a = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<i; j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
    static void starPlus(int rows){
        if(rows%2 == 0) return;
        int mid = rows/2+1;
        for(int i=1; i<=rows; i++){
            for (int j=1; j<=rows; j++){
                if(i==mid || j==mid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        starPlus(7);
    }
}
