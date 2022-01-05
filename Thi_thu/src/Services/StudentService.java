package Services;

import Models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IService {
    public static final String STUDENT_CSV = "D:\\CodeGym\\C1021G1-MacMaiTrungHieu\\Thi_thu\\src\\Data\\Student.csv";
    static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public StudentService() {
        readFile();
    }

    public void add() {
        boolean check;
        String gender = null;
        String birthDay = null;
        String regexDayOfBirth = "^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";
        String regexGender = "(Nam|Nữ|Khác)";
        String regexId = "";
        System.out.println("Nhập mới sinh viên:");
        System.out.println("Nhập mã sinh viên :");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        do {
            System.out.println("Nhập ngày tháng năm sinh");
            birthDay = scanner.nextLine();
            if (birthDay.matches(regexDayOfBirth)) {
                break;
            } else {
                System.out.println("Nhập đúng định dạng dd/mm/yyyy");
            }
        } while (true);
        do {
            System.out.println("Nhập giới tính");
            gender = scanner.nextLine();
            if (gender.matches(regexGender)) {
                break;
            } else {
                System.out.println("Nhập đúng giới tính Nam, Nữ hoặc Khác");
            }
        } while (true);
        System.out.println("Nhập lớp");
        String nameClass = scanner.nextLine();
        System.out.println("Nhập điểm số");
        String poin = scanner.nextLine();
        Student student = new Student(id, name, birthDay, gender, nameClass, poin);
        studentList.add(student);
        writeFile();
    }

    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
//            System.out.println("---Hiển thị sinh viên---");
//            System.out.println("Mã số sinh viên " + student.getId());
//            System.out.println("Tên sinh viên " + student.getName());
//            System.out.println("Ngày tháng năm sinh " + student.getBirthDay());
//            System.out.println("Giới tính " + student.getGender());
//            System.out.println("Sinh viên lớp " + student.getNameClass());
//            System.out.println("Bảng điểm " + student.getPoin());
        }
    }

    public void remove() {
        System.out.println("Nhập id muốn xóa");
        String id = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                do {
                    System.out.println("Bạn có muốn xóa sinh viên có ID " + id + " không?");
                    System.out.println("YES or NO");
                    String yes = scanner.nextLine();
                    if (yes.equals("YES")) {
                        studentList.remove(i);
                        System.out.println("Xóa thành công");
                        break;
                    } else {
                        System.out.println("Xóa ko thành công vui lòng nhập đúng định dạng YES or NO");
                    }
                } while (true);
            }
        }
    }

    public void find() {
        System.out.println("Nhập tên muốn tìm kiếm");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println(studentList.get(i));
            }
        }
    }

    public static void writeFile() {

        try {
            FileWriter fileWriter = new FileWriter(STUDENT_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList) {
                bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getBirthDay() + ","
                        + student.getGender() + "," + student.getNameClass() + "," + student.getPoin());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        studentList.clear();
        try {
            FileReader fileReader = new FileReader(STUDENT_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                String[] dataArray = data.split(",");
                Student student = new Student(dataArray[0], dataArray[1], dataArray[2], dataArray[3], dataArray[4], dataArray[5]);
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
