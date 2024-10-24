import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(2));

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();
        list.add(1,100);
        System.out.println(list);
        list.set(1,10);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(6));
        System.out.println(list);
        boolean flag = list.contains(Integer.valueOf(7));
        System.out.println(flag);
    }
}