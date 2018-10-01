import java.util.*;

public class ComparatorTest {
public static List<TestComparingObject> list = new ArrayList<>();
static {
    list.add(new TestComparingObject(1,"A"));
    list.add(new TestComparingObject(2,"A"));
    list.add(new TestComparingObject(null,"C"));
    list.add(new TestComparingObject(null,"B"));
    list.add(new TestComparingObject(4,"C"));
    list.add(new TestComparingObject(5,"A"));
    list.add(new TestComparingObject(10,"A"));
    list.add(new TestComparingObject(21,"A"));
    list.add(new TestComparingObject(3,"A"));
    list.add(new TestComparingObject(7,"A"));
}

    public static void main(String[] args) {
        list.forEach(System.out::println);
//
//        Collections.sort(list, new Comparator<TestComparingObject>() {
//            @Override
//            public int compare(TestComparingObject o1, TestComparingObject o2) {
//                Integer publishDate1 = o1.getInt_field();
//                Integer publishDate2 = o2.getInt_field();
//                if (publishDate1 == null && publishDate2 == null){
//                    return 0;
//                }
//                if (publishDate1 == null){ return 1; }
//                if (publishDate2 == null){ return -1; }
//
//                return publishDate1.compareTo(publishDate2);
//            }
//        });
        System.out.println(list.size());
        System.out.println();
//        list.forEach(System.out::println);
        list.removeIf(tc -> tc.getString_field().equals("C"));
        list.forEach(System.out::println);
        System.out.println(list.size());
    }


}
