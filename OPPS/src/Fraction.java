public class Fraction {
    static fraction add(fraction f1, fraction f2){
        int numerator = f2.den*f1.num + f2.num*f1.den;
        int denomintor = f1.den * f2.den;
        fraction f3 = new fraction(numerator,denomintor);
        return f3;
    }
    static fraction multiply(fraction f1, fraction f2){
        int nume = f1.num * f2.num;
        int deno = f1.den *f2.den;
        fraction f4 = new fraction(nume,deno);
        return f4;
    }
    static int gcd(int num, int den){
        int result = Math.min(num,den);
        for(int i = result; i>=1; i--){
            if(num % i == 0 && den%i==0){
                return i;
            }
        }
        return result;
    }
    static class fraction{
        int num;
        int den;
        fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        void simplify(){
            int hcf = gcd(num,den);
            num/=hcf;
            den/=hcf;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(35,21);
        System.out.println(f1.num+"/"+f1.den);
        fraction f2 = new fraction(7,3);
        System.out.println(f1.num+"/"+f1.den);
        fraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        fraction f4 = multiply(f1,f2);
        System.out.println(f4.num+"/"+f4.den);
    }
}
