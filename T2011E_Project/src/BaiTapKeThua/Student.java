package BaiTapKeThua;

public class Student extends Persion{
    private String id;

    public Student() {
        this.id = id;
    }

    public Student(String ten, String diachi, String sdt, String id) {
        super(ten, diachi, sdt);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
