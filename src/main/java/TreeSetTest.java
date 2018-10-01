import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetTest {


    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        TreeSet<Integer> list = new TreeSet<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(20);
        list.add(30);
        Integer a = list.ceiling(29);
        if (a!=null) {
            System.out.println(a);
        } else {
            System.out.println("null");
        }
//        System.out.println(strings);

    }
}
