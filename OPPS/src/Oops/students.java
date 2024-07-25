package Oops;

public class students {
    String name;
    int rno;
    double percent;
    public int getRno(){ // getter -> to access value
        return rno;
    }
    public void setRno(int rno){ // setter -> to set the value
        this.rno = rno;
    }
    public students(String name,int rno,double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
    }
    public students(){

    }
    static void display(students s){
        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.percent);
    }
}
