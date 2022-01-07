package module2.Controller;

import java.util.Scanner;

public class MainController {
    static Scanner scanner;

    public static void main(String[] args) {
        run();
    }

    static void run() {
        scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println();
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
            System.out.println();
            System.out.println("Chọn chức năng theo số (để tiếp tuc):");
            System.out.println();
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Sửa học sinh hoặc giảng viên");
            System.out.println("3. Xoá danh sách giảng viên hoặc học sinh");
            System.out.println("4. Tìm kiếm giảng viên hoặc hoặc sinh");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("6. Thoát chương trình");
            System.out.println("Chọn chức năng");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("vui lòng nhập một số");
                continue;
            }
            switch (choice) {
                case 1:
                    BusinessController.add();
                    run();
                    break;
                case 2:
                    BusinessController.edit();
                    run();
                    break;
                case 3:
                    BusinessController.delete();
                    run();
                    break;
                case 4:
                    BusinessController.search();
                    run();
                    break;
                case 5:
                    BusinessController.display();
                    run();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1 đến 6");
                    continue;
            }
            break;
        } while (true);
    }
}
