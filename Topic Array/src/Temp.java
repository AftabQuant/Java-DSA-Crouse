interface Ab{
    void draw();
}
interface XY extends Ab{
    void write();
}
class CD implements XY{
    public void draw(){
        System.out.println("Drawing");
    }
    public void write(){
        System.out.println("Writing");
    }
}
public class Temp{
    public static void main(String[] args) {
        CD c = new CD();
        c.draw();
        c.write();
    }
}
