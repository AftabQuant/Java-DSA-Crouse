package Test2;

public class Student{
    String name;
    private int roll = 32;
    boolean backlog ;
    void eating(){
        System.out.println("Student is eating......");
    }
    public Student(String name, int roll, boolean backlog){
        this.name = name;
        this.roll = roll;
        this.backlog = backlog;
    }
    Student(){

    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
}
