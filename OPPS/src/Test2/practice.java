package Test2;
import java.util.Scanner;

public class practice{
    static String fun(Student s1){
        return s1.name = "Imran";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Aftab";
        System.out.println(s1.getRoll());
        s1.backlog = false;
        System.out.println(s1.name);
        s1.eating();
        Student s2 = new Student("Aftab",32,false);
        System.out.println(s2.name);
    }
}

