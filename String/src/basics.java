import java.util.Scanner;

public class basics{
    public static void main(String[] args) {
        String str = "Aftab ";
        String str2 = "Uddin";
        System.out.println(str);
//        Scanner sc = new Scanner(System.in);
//        String str2 = sc.nextLine();
//        System.out.println(str2);
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.indexOf('A'));
        System.out.println(str.compareTo(str2));
        System.out.println(str.contains("ta"));
        System.out.println(str.concat(str2));
    }
}
