package OOPS;

public class Students{
    String name;
    int rno;
    private double percentage;
    final String schoolName = "Mustafapur High Madrasah!";
    static int numOfStudent;
    public Students(String name, int rno, double percentage){
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
        numOfStudent++;
    }
    public Students(){}
    public double getPercentage(){ return percentage;}
    public void setPercentage(double percentage){this.percentage = percentage;}

}
