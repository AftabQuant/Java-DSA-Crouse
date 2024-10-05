import java.util.Scanner;

public class NoteDenomination{
    static void denomination(int amn){
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[notes.length];
        for(int i=0; i<notes.length; i++){
            count[i] = amn / notes[i];
            amn %= notes[i];
        }
        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                System.out.println(notes[i]+ " "+ count[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Amount : ");
        int amn = sc.nextInt();
        denomination(amn);
    }
}
