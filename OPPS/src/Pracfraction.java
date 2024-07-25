public class Pracfraction {
    static Fraction add(Fraction f1, Fraction f2){
        int num = f2.den*f1.num+ f2.num*f1.den;
        int den = f1.den * f2.den;
        Fraction f3 = new Fraction(num,den);
        return f3;
    }
    static int gcd(int x, int y){
        int min = Math.min(x,y);
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return min;
    }
    static class Fraction{
        int num;
        int den;
        Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplyfy();
        }
        void simplyfy(){
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        Fraction f2 = new Fraction(35,21);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3 = add(f1,f2);


    }
}
