import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int x = sc.nextInt();
        String name = sc.nextLine();
        int ages[] = new int[x];
        for(int i=0;i<x;i++){
            ages[i] = sc.nextInt();
        }
        for(int i=0; i<5;i++){
            System.out.println(ages[i]);
        }
        System.out.println("Hello world!");
    }
}