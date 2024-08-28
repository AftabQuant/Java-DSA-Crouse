package Heap;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rno;
    double percentage;
    String name;
    Student(int rno, double percentage, String name){
        this.rno = rno;
        this.percentage = percentage;
        this.name = name;
    }
    // Roll Num Wise Sort
//    public int compareTo(Student s){
//        return this.rno - s.rno;
//    }
    // Percentage Wise Sort -> Double To Integer
//    public int compareTo(Student s){
//        return (int) (this.percentage - s.percentage);
//    }
    // String Wise Sort
    public int compareTo(Student s){
        return this.name.charAt(0) - s.name.charAt(0);
    }
}
public class CustomComparator{
    static void display(Student[] ch){
        for(Student st: ch) {
            System.out.print(st.rno + "  " + st.percentage + "  " + st.name + " ");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(32,89.5,"Aftab");
        s[1] = new Student(45,85.5,"Imran");
        s[2] = new Student(24,68.9,"Ariful");
        s[3] = new Student(78,60.6,"Firoz");
        display(s);
        Arrays.sort(s);
        display(s);
    }
}
