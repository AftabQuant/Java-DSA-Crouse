public class interning{
    public static void main(String[] args) {
        String str = "hello";
        String gtr = "hello";
        gtr = "mello";
        System.out.println(str);
        System.out.println(gtr);
        System.out.println(str);
        String xtr = new String("hello");
        System.out.println(str==xtr);
        System.out.println(str.equals(xtr));
    }
}
