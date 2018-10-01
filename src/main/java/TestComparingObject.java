public class TestComparingObject {
    private Integer int_field;
    private String string_field;

    public TestComparingObject() { }

    public TestComparingObject(Integer int_field, String string_field) {
        this.int_field = int_field;
        this.string_field = string_field;
    }

    public Integer getInt_field() {
        return int_field;
    }

    public void setInt_field(Integer int_field) {
        this.int_field = int_field;
    }

    public String getString_field() {
        return string_field;
    }

    public void setString_field(String string_field) {
        this.string_field = string_field;
    }

    @Override
    public String toString() {
        return "TestComparingObject{" +
                "int_field=" + int_field +
                ", string_field='" + string_field + '\'' +
                '}';
    }
}
