package ss4_access_modifier_static_method_static_property.thuc_hanh;

public class Student {
    private String name;
    private int rollno;
    private static String college = "BBDIT";

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    static void change() {
        college = "CodeGym";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
