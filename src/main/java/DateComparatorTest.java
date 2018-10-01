import java.util.*;

public class DateComparatorTest {
    static List<Date> list = new ArrayList<>();
    static {
    list.add(new Date(2014, 10, 15));
    list.add(new Date(2014, 10, 10));
    list.add(new Date(2014, 10, 12));
    list.add(null);
    list.add(new Date(2014, 10, 13));
    list.add(new Date(2014, 10, 14));
    list.add(new Date(2014, 10, 11));
    }

    public static void main(String[] args) {
        list.forEach(System.out::println);
        list.sort((o1, o2) -> {
            if (o1 == null && o2 == null) {
                return 0;
            }
            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }

            return o1.compareTo(o2);
        });
        System.out.println("---------------");
        list.forEach(System.out::println);
    }
}
