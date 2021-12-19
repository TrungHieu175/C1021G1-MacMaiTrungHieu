package ss4_access_modifier_static_method_static_property.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("This student: " + student);
        student.setName("Ngoc");
        student.setClasses("C10");
        System.out.println("This new student: " + student);
    }
}
