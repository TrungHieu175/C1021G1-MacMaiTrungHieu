package Services;

import Models.Student;
import Models.Teacher;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherSevice implements IService{
    List<Teacher> teacherList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Nhập mới giảng viên:");
        System.out.println("Nhập mã giảng viên:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên giảng viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập chuyên môn");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,birthDay,gender,specialize);
        teacherList.add(teacher);
    }

    @Override
    public void display() {
        for(Teacher student : teacherList){
            System.out.println("---Hiển thị giảng viên---");
            System.out.println("Mã số giảng viên " + student.getId());
            System.out.println("Tên giảng viên " + student.getName());
            System.out.println("Ngày tháng năm sinh " + student.getBirthDay());
            System.out.println("Giới tính " + student.getGender());
            System.out.println("Trình độ chuyên môn " + student.getSpecialize());
        }

    }

    @Override
    public void remove() {

    }

    @Override
    public void find() {

    }
}
