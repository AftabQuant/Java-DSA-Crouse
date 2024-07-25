package taste;

public class testing {
     static fraction add(fraction f1,fraction f2){
        int nume = f1.num*f2.den + f2.num*f1.den;
        int dene = f1.den*f2.den;
        fraction f3 = new fraction(nume,dene);
        return f3;
    }
    static int gcd(int num, int den){
        int min = Math.min(num,den);
        for(int i=min;i>=1;i--){
            if(num%i==0 && den%i==0){
                return i;
            }
        }
        return min;
    }
    static class fraction{
        int num;
        int den;
        fraction(int num, int den){
            this.num= num;
            this.den= den;
            simplyfy();
        }
        void simplyfy(){
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(14,35);
        System.out.println(f1.num+"/"+f1.den);
        fraction f2 = new fraction(3,7);
        System.out.println(f1.num+"/"+f1.den);
        fraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
    }
}
