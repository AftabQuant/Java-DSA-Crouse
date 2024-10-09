package OOPS;

public class Student{
    static void printObject(Students s){
        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.getPercentage());
        System.out.println(Students.numOfStudent);
        System.out.println();
    }
    public static void main(String[] args) {
        Students s1 = new Students("Aftab",32,87.9);
        s1.setPercentage(78.43);
        System.out.println(s1.getPercentage());
        printObject(s1);
        Students s2 = new Students("Ankesh",41,87.7);
        printObject(s2);
        Students s3 = new Students("Manish",46,87.5);
        printObject(s3);
    }
}
