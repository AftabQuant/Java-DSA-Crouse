import java.util.Scanner;
public class costofitem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float gst = sc.nextFloat();
        gst=gst/100;
        float total =  (pencil+pen+eraser) +((pencil+pen+eraser) * gst);
        System.out.println("The total price of the items: "+total);
    }
}
