class pen{
    int num;
    String name;
    void print(){
        System.out.println("Write something");
    }
    pen(int num, String name){
        this.num = num;
        this.name = name;
        System.out.println(this.num);
        System.out.println(this.name);
    }
    pen(){

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        pen obj2 = new pen(34,"Aftab");
        pen obj1 = new pen();
        obj1.num = 3;
        obj1.name = "Aftab";
        System.out.println(obj1.name);
        System.out.println(obj1.num);
        obj1.print();
    }
}