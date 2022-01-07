package module2.Controller;

import module2.utils.Validation;
import test.model.Person;

import java.util.Scanner;

public class BusinessController {
    static Scanner scanner;
    static int choice;

    static void add(){
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Thêm một thành viên mới");
        do{

            System.out.println();
            System.out.println("1. Thêm một học viên");
            System.out.println("2. Thêm một giảng viên");
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Vui lòng nhập một số");
                continue;
            }

            switch (choice){
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1 đến 2");
                    continue;
            }
            break;
        }while(true);
    }
    static void search() {
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
        if(!check){
            System.out.println("data not exist");
        }
    }
    static void edit(){
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //
    }
    static void display(){
        scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        System.out.println(Validation.checkDate(date));
    }
    static void delete() {

        int choice = 0;
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Xoá thành viên");
        do{
            System.out.println();
            System.out.println("1. Xoá một học sinh");
            System.out.println("2. Xoá một giảng viên");
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Vui lòng nhập một số");
                continue;
            }

            switch (choice){
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1 đến 2");
                    continue;
            }
            break;
        }while(true);
    }
}
