package Constructor;

public class Student {
    public static void main(String[] args) {
//        students s1 = new students();
//        s1.name = "Aftab";
//        s1.rno = 32;
//        s1.percent = 87.9;
//        s1.display(s1);
        students s2 = new students("Aftab",32,87.90);
        System.out.println(students.numofstudent);
        students s3 = new students("Aftab",32,87.90);
        students s4 = new students("Aftab",32,87.90);
        students s5 = new students("Aftab",32,87.90);
        System.out.println(students.numofstudent);
    }
}
