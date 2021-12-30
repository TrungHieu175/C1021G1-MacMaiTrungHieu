package services;

import models.person.Customer;
import models.person.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService{
    static List<Customer> customersList = new LinkedList<>();
    static int id = 0;
    Scanner scanner = new Scanner(System.in);
    public CustomerServiceImpl() {
        id++;
        Customer customer = new Customer(id,"Mai Hieu", "17/05/1995","Male","201682203","0935122JQK","hieu@gmail.com","Vip","The moon");
        customersList.add(customer);
    }
    public void edit() {
        System.out.println("Chỉnh sửa thông tin khách hàng");
        System.out.println("Nhập id");
        int customerId = Integer.parseInt(scanner.nextLine());
        boolean existedCustomer = false;

        for (Customer customer : customersList) {
            if (customer.getId() == customerId) {
                existedCustomer = true;
                System.out.println("Nhập tên đi");
                String name = scanner.nextLine();
                customer.setFullName(name);
                System.out.println("Nhập ngày tháng năm sinh");
                String birthDay = scanner.nextLine();
                customer.setBirthDay(birthDay);
                System.out.println("Nhập giới tánh");
                String gender = scanner.nextLine();
                customer.setGender(gender);
                System.out.println("Nhập CMND");
                String idCard = scanner.nextLine();
                customer.setIdCard(idCard);
                System.out.println("Choa xin cái số");
                String phoneNumber = scanner.nextLine();
                customer.setPhoneNumber(phoneNumber);
                System.out.println("Nhập Ê meo");
                String email = scanner.nextLine();
                customer.setEmail(email);
                System.out.println("Khách loại zì");
                String type = scanner.nextLine();
                customer.setCustomerType(type);
                System.out.println("Choa xin cái địa chỉ");
                String location = scanner.nextLine();
                customer.setLocation(location);
        }
        if(!existedCustomer){
            System.out.println("Không tìm thấy");
        }
    }
    }

    public void add() {
        System.out.println("Tạo mới khách hàng");
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
        System.out.println("Loại khách zì");
        String type = scanner.nextLine();
        System.out.println("Choa xin cái địa chỉ");
        String location = scanner.nextLine();
        id++;
        Customer newCustomer = new Customer(id,name,birthDay,gender,idCard,phoneNumber,email,type,location);
        customersList.add(newCustomer);
    }

    public void display() {
        for (Customer customer: customersList) {
            System.out.println("---------------------------------------Hello What's up-------------------------------------");
            System.out.println("Mã nhân viên: "+ customer.getId());
            System.out.println("Tên nhân viên: " + customer.getFullName());
            System.out.println("Ngày tháng năm sinh: " + customer.getBirthDay());
            System.out.println("Giới tánh: " + customer.getGender());
            System.out.println("CMND: " + customer.getIdCard());
            System.out.println("Số điện thoại: " + customer.getPhoneNumber());
            System.out.println("Mèo méo meo mèo meo: " + customer.getEmail());
            System.out.println("Trình độ: " + customer.getCustomerType());
            System.out.println("Chức zụ: " + customer.getLocation());
    }
}
}
