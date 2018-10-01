public class Testin {
    public static void main(String[] args) {

        StringBuffer builder = new StringBuffer();

        String text = "some text";
        String num = "№";
        String str = num + "0111100005218000079";

        builder.append(text).append(num).append(str);

        System.out.println(builder.toString().contains(num));
    }
}
