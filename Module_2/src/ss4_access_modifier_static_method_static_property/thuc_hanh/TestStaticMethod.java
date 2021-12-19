package ss4_access_modifier_static_method_static_property.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student = new Student("Hoang",111);
        Student student1 = new Student("Hoi",222);
        Student student2 = new Student("Hi",333);

        student1.display();
        student.display();
        student2.display();
    }
}
