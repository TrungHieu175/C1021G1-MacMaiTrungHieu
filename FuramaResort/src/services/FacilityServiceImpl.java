package services;

import models.facility.Facility;
import models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    LinkedHashMap<Facility,Integer> facilityMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);
    public void maintenance() {

    }

    public void add() {
        System.out.println("---------------------------------------Hello What's up-------------------------------------");
        System.out.println("Tạo mới cơ sở hạ tầng");
        System.out.println("Nhập tên dịch zụ");
        String nameSevice = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        Double areaUse = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập giá thuê");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người");
        Integer person = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số ngày thuê");
        Integer daily = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã dịch vụ");
        Integer serviceId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu phòng");
        String classRoom = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        Double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng");
        Integer stage = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa (nameSevice,areaUse,price,person,daily,serviceId,classRoom,areaPool,stage);
        facilityMap.put(villa, 0);
    }

    public void display() {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityMap.entrySet()){
            System.out.println(facilityIntegerEntry);
        }
    }
}
