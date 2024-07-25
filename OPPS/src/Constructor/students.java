package Constructor;

public class students {
    String name;
    int rno;
    double percent;
    final String school = "MHM"; // -> to final attribute
    static int numofstudent;
    static void display(students k){
        System.out.println(k.name);
        System.out.println(k.rno);
        System.out.println(k.percent);
        System.out.println(k.school);
    }
    public students(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numofstudent++;
    }
    public students(){

    }
}
