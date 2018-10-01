import java.util.ArrayList;
import java.util.List;

public class ArrayTest {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        List<Integer> result = new ArrayList<>();
        method(list, 2, result);
        System.out.println(result);
//        String[] al = {"OK111", "OKU111", "OKD111", "ZKK111", "ZKKD111", "ZKKU111"};
//        String code = "OKD112";
//        System.out.println(contains(al, code));





    }

    private static void method(List<Integer> array, int compared, List<Integer> result) {
        for (int e : array) {
            if (e == compared) {
                result.add(e);
                break;
            }
        }
    }

    private static String contains(String[] arr, String elem) {
        for (String e : arr) {
            if (elem.equalsIgnoreCase(e)) {
                return "true"; }
        }
        return "false";
    }
}
