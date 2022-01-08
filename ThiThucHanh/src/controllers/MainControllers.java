package controllers;

import services.ExportProductsService;
import services.ImportedProductsService;

import java.util.Scanner;

public class MainControllers {
    static Scanner scanner;
    public static ImportedProductsService importedProductsService = new ImportedProductsService();
    public static ExportProductsService exportProductsService = new ExportProductsService();
    static int choice;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println();
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM--");
            System.out.println();
            System.out.println("Chọn chức năng theo số (để tiếp tuc):");
            System.out.println();
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xoá sản phẩm");
            System.out.println("3. Xem danh sách các sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Thoát chương trình");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("vui lòng nhập một số");
                continue;
            }
            switch (choice) {
                case 1:
                    add();
                    menu();
                    break;
                case 2:
                    remove();
                    menu();
                    break;
                case 3:
                    display();
                    menu();
                    break;
                case 4:
                    find();
                    menu();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1 đến 5");
                    continue;
            }
            break;
        } while (true);
    }

    static void add() {
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Thêm một sản phẩm mới");
        do {
            System.out.println();
            System.out.println("1. Thêm sản phẩm nhập khẩu");
            System.out.println("2. Thêm sản phẩm xuất khẩu");
            System.out.println("3. Trở về Menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập một số");
                continue;
            }

            switch (choice) {
                case 1:
                    importedProductsService.add();
                    break;
                case 2:
                    exportProductsService.add();
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1,2 hoặc 3");
                    continue;
            }
            break;
        } while (true);
    }

    static void find() {
        String name;
        scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên");
        name = scanner.nextLine();
        boolean check = false;
//        for(Person person : personList){
//            if(person.getName().toLowerCase().contains(name));
//            System.out.println(person);
//            check = true;
//        }
        if (!check) {
            System.out.println("data not exist");
        }
    }

    static void display() {
        boolean checkChoice = false;
        do {
            System.out.println();
            System.out.println("----Xem danh sản phẩm-----");
            System.out.println("1. Xem danh sách sản phẩm nhập");
            System.out.println("2. Xem danh sách sản phẩm xuất");
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
                    importedProductsService.display();
                    checkChoice = true;
                    continue;
                case 2:
                    exportProductsService.display();
                    checkChoice = true;
                    continue;
                case 3:
                    menu();
                    break;
            }
        } while (checkChoice);
    }

    static void remove() {

        int choice = 0;
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Xoá thành viên");
        do {
            System.out.println();
            System.out.println("1. Xoá sản phẩm nhập khẩu");
            System.out.println("2. Xoá sản phẩm xuất khẩu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập một số");
                continue;
            }

            switch (choice) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    menu();
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1,2 hoặc 3");
                    continue;
            }
            break;
        } while (true);
    }
}
