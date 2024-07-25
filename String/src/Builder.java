public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append(" world");
        System.out.println(str);
        str.setCharAt(0,'m');
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(3);
        System.out.println(str);
        str.substring(2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
