package services;

import models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService{
    static List<Employee> employeeList = new ArrayList<>();
    static int id = 0;
    Scanner scanner = new Scanner(System.in);
    public EmployeeServiceImpl() {
        id++;
        Employee employee = new Employee(id,"Mai Hieu", "17/05/1995","Male","201682203","0935122JQK","hieu@gmail.com","A","Manager",10000000);
        employeeList.add(employee);
    }

    public void edit() {
        System.out.println("Chỉnh sửa thông tin nhân viên");
        System.out.println("Nhập id");
        int employeeId = Integer.parseInt(scanner.nextLine());
        boolean existedEmployee = false;

        for (Employee employee : employeeList) {
            if (employee.getId() == employeeId) {
                existedEmployee = true;
                System.out.println("Nhập tên đi");
                String name = scanner.nextLine();
                employee.setFullName(name);
                System.out.println("Nhập ngày tháng năm sinh");
                String birthDay = scanner.nextLine();
                employee.setBirthDay(birthDay);
                System.out.println("Nhập giới tánh");
                String gender = scanner.nextLine();
                employee.setGender(gender);
                System.out.println("Nhập CMND");
                String idCard = scanner.nextLine();
                employee.setIdCard(idCard);
                System.out.println("Choa xin cái số");
                String phoneNumber = scanner.nextLine();
                employee.setPhoneNumber(phoneNumber);
                System.out.println("Nhập Ê meo");
                String email = scanner.nextLine();
                employee.setEmail(email);
                System.out.println("Xin cái trình");
                String level = scanner.nextLine();
                employee.setLevel(level);
                System.out.println("Làm chức gì?");
                String position = scanner.nextLine();
                employee.setPosition(position);
                System.out.println("Lương nhiu");
                double salary;
                String salaryString = scanner.nextLine();
                while (!isDouble(salaryString)){
                    System.out.println("Phải nhập định dạng số");
                    System.out.println("Lương nhiu");
                    salaryString = scanner.nextLine();
                }

                salary = Double.parseDouble(salaryString);
                employee.setSalary(salary);
            }
        }
        if(!existedEmployee){
            System.out.println("Không tìm thấy");
        }
    }

    public void add() {
        System.out.println("Tạo mới nhân viên");
        System.out.println("Nhập tên đi");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập giới tánh");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND");
        String idCard = scanner.nextLine();
        System.out.println("Choa xin cái số");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Ê meo");
        String email = scanner.nextLine();
        System.out.println("Xin cái trình");
        String level = scanner.nextLine();
        System.out.println("Làm chức gì?");
        String position = scanner.nextLine();
        System.out.println("Lương nhiu");
        double salary;
        String salaryString = scanner.nextLine();
        while (!isDouble(salaryString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Lương nhiu");
            salaryString = scanner.nextLine();
        }

        salary = Double.parseDouble(salaryString);
        id++;
        Employee newEmployee = new Employee(id,name,birthDay,gender,idCard,phoneNumber,email,level,position,salary);
        employeeList.add(newEmployee);
    }

    public void display() {
        for (Employee employee: employeeList) {
            System.out.println("---------------------------------------Hello What's up-------------------------------------");
            System.out.println("Mã nhân viên: "+ employee.getId());
            System.out.println("Tên nhân viên: " + employee.getFullName());
            System.out.println("Ngày tháng năm sinh: " + employee.getBirthDay());
            System.out.println("Giới tánh: " + employee.getGender());
            System.out.println("CMND: " + employee.getIdCard());
            System.out.println("Số điện thoại: " + employee.getPhoneNumber());
            System.out.println("Mèo méo meo mèo meo: " + employee.getEmail());
            System.out.println("Trình độ: " + employee.getLevel());
            System.out.println("Chức zụ: " + employee.getPosition());
            System.out.println("Lương nè: " + employee.getSalary());
        }
    }
    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

