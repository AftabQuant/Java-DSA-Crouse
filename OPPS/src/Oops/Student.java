package Oops;
public class Student {
    public static void main(String[] args) {
        students s1 = new students();
        s1.name = "Aftab";
        s1.percent = 98.6;
        System.out.println(s1.getRno());
        s1.setRno(32);
        System.out.println(s1.getRno());
        students s2 = new students();
        s2.name = "Imran";
        s2.percent = 90.6;
        System.out.println(s2.getRno());
        s2.setRno(56);
        System.out.println(s2.getRno());
    }
}
