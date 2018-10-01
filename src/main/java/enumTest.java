import java.util.ArrayList;
import java.util.List;

public class enumTest {
    public static void main(String[] args) {
    List<DocTypeCode> list = new ArrayList<>();
    list.add(DocTypeCode.DI);
    list.add(DocTypeCode.DI);
    list.add(DocTypeCode.DPO);
    list.add(DocTypeCode.P);
    list.add(DocTypeCode.I615);
    list.add(DocTypeCode.II615);

        List<DocTypeCode> objects = new ArrayList<>();

        objects = DocTypeCode.getDocsByDocTitle(list, DocTypeCode.DI);
        System.out.println(objects.toString());
    }
}


