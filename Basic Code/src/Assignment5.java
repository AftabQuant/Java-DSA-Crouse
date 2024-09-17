import java.util.Calendar;

class Volume{
    int a; int r; int h;
    Volume(int a){
        this.a = a;
    }
    static int volume(int a){
        return a*a*a;
    }
    Volume(int r, int h){
        this.r = r;
        this.h = h;
    }
    double volume(int r, int h){
        return ((double)22/7) * r *r * h;
    }
    double volume2(int r){
        return ((double) 4/3*22/7) *r*r*r;
    }
}
public class Assignment5{
    double r; double l; double w; int a;
//    Assignment5(double r){
//        this.r = r;
//    }
    Assignment5(int a){
        this.a = a;
    }
    Assignment5(double l, double w){
        this.l = l; this.w = w;
    }
    static double periRectangle(double l, double w){
        return (2*(l+w));
    }
    static double periCycle(double r){
        return (2*((double) 22 /7)*r);
    }
    static double periSquare(int a){
        return (4 * a);
    }
    public static void main(String[] args) {
        Volume v1 = new Volume(5);
        System.out.println(v1.volume(v1.a));
        Volume v2 = new Volume(5,4);
        System.out.println(v2.volume(v2.r, v2.h));
        System.out.println(v1.volume2(v1.a));
    }
}
