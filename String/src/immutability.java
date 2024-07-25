public class immutability{
    public static void main(String[] args) {
        String str = "hello";
        //str.charAt(1)='r';
//        str = "dello";
        System.out.println(str);
        str = str.substring(0,2) +'y'+str.substring(3);
        System.out.println(str);
    }
}
