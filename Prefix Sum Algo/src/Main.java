class S{
     static void print(){
        System.out.println("Hello World2 !");
    }
}
public class Main{
    static void change(int num){
        num *= 100;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        S.print();
        int a = 10;
        System.out.println("Before Changing The Value: "+ a);
        change(a);
        System.out.println("After Changing The Value: "+ a);
    }
}