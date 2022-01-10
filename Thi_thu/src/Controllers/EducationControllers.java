package Controllers;

import Models.Student;
import Models.Teacher;
import Services.StudentService;
import Services.TeacherSevice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EducationControllers {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    static boolean checkChoice = false;
    public static final String LUI = "\t\t\t\t\t\t\t\t\t\t\t\t\t";
    public static StudentService studentService = new StudentService();
    public static TeacherSevice teacherSevice = new TeacherSevice();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            System.out.println(LUI + "--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –");
            System.out.println(LUI + "Chọn chức năng theo số (để tiếp tục)");
            System.out.println(LUI + "1. Thêm mới giảng viên hoặc học sinh");
            System.out.println(LUI + "2. Xóa giảng viên hoặc học sinh");
            System.out.println(LUI + "3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println(LUI + "4. Tìm kiếm giảng viên hoặc học sinh");
            System.out.println(LUI + "5. Thoát");
            System.out.println(LUI + "Chọn chức năng:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("----Thêm mới giảng viên hoặc học sinh-----");
                        System.out.println("1. Thêm mới sinh viên");
                        System.out.println("2. Thêm mới giảng viên");
                        System.out.println("3. Trở lại Menu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số");
                            checkChoice = true;
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                studentService.add();
                                checkChoice = true;
                                continue;
                            case 2:
                                teacherSevice.add();
                                checkChoice = true;
                                continue;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    } while (checkChoice);
                case 2:
                    do {
                        System.out.println();
                        System.out.println("----Xóa giảng viên hoặc học sinh-----");
                        System.out.println("1. Xóa sinh viên");
                        System.out.println("2. Xóa giảng viên");
                        System.out.println("3. Trở lại Menu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số");
                            checkChoice = true;
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                studentService.remove();
                                checkChoice = true;
                                continue;
                            case 2:
                                teacherSevice.remove();
                                checkChoice = true;
                                continue;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    } while (checkChoice);
                case 3:
                    do {
                        System.out.println();
                        System.out.println("----Xem danh sách giảng viên hoặc học sinh-----");
                        System.out.println("1. Xem danh sách sinh viên");
                        System.out.println("2. Xem danh sách giảng viên");
                        System.out.println("3. Trở lại Menu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số");
                            checkChoice = true;
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                studentService.display();
                                checkChoice = true;
                                continue;
                            case 2:
                                teacherSevice.display();
                                checkChoice = true;
                                continue;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    } while (checkChoice);
                case 4:
                    do {
                        System.out.println();
                        System.out.println("----Tìm kiếm giảng viên hoặc học sinh-----");
                        System.out.println("1. Tìm kiếm sinh viên");
                        System.out.println("2. Tìm kiếm giảng viên");
                        System.out.println("3. Trở lại Menu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập số");
                            checkChoice = true;
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                studentService.find();
                                checkChoice = true;
                                continue;
                            case 2:
                                teacherSevice.find();
                                checkChoice = true;
                                continue;
                            case 3:
                                displayMainMenu();
                                break;
                        }
                    } while (checkChoice);
                case 5:
                    System.out.println("Gút bai");
                    System.exit(0);
            }
        } while (checkChoice);
    }

}
