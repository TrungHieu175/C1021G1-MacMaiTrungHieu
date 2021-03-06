package services;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void maintenance() {

    }

    public void addVilla() {
        System.out.println("---------------------------------------Hello What's up-------------------------------------");
        System.out.println("Tạo mới cơ sở hạ tầng");
        System.out.println("Nhập tên dịch zụ");
        String nameSevice = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        double areaUse;
        String areaUseString = scanner.nextLine();
        while (!isDouble(areaUseString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập diện tích sử dụng");
            areaUseString = scanner.nextLine();
        }
        areaUse = Integer.parseInt(areaUseString);
        System.out.println("Nhập giá thuê");
        double price;
        String priceString = scanner.nextLine();
        while (!isDouble(priceString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập giá thuê");
            priceString = scanner.nextLine();
        }
        price = Integer.parseInt(priceString);
        System.out.println("Nhập số lượng người");
        int person;
        String personString = scanner.nextLine();
        while (!isInt(personString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập số lượng người");
            personString = scanner.nextLine();
        }
        person = Integer.parseInt(personString);
        System.out.println("Nhập số ngày thuê");
        int daily;
        String dailyString = scanner.nextLine();
        while (!isInt(dailyString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập số ngày thuê");
            dailyString = scanner.nextLine();
        }
        daily = Integer.parseInt(dailyString);
        System.out.println("Nhập mã dịch vụ");
        int serviceId;
        String serviceIdString = scanner.nextLine();
        while (!isInt(serviceIdString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập số ID");
            serviceIdString = scanner.nextLine();
        }
        serviceId = Integer.parseInt(serviceIdString);
        System.out.println("Nhập kiểu phòng");
        String classRoom = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi");
        double areaPool;
        String areaPoolString = scanner.nextLine();
        while (!isDouble(areaPoolString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập diện tích hồ bơi");
            areaPoolString = scanner.nextLine();
        }
        areaPool = Integer.parseInt(areaPoolString);
        System.out.println("Nhập số tầng");
        int stage;
        String stageString = scanner.nextLine();
        while (!isInt(stageString)){
            System.out.println("Phải nhập định dạng số");
            System.out.println("Nhập số tầng");
            stageString = scanner.nextLine();
        }
        stage = Integer.parseInt(stageString);
        Villa villa = new Villa(nameSevice, areaUse, price, person, daily, serviceId, classRoom, areaPool, stage);
        facilityMap.put(villa, 0);
    }

    @Override
    public void editVilla() {

    }

    @Override
    public void addHouse() {
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
        System.out.println("Nhập số tầng");
        Integer stage = Integer.parseInt(scanner.nextLine());
        House house = new House(nameSevice, areaUse, price, person, daily, serviceId, classRoom, stage);
        facilityMap.put(house, 0);
    }

    @Override
    public void editHouse() {

    }

    @Override
    public void addRoom() {
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
        System.out.println("Nhập dịch vụ miễn phí");
        String freeSevice = scanner.nextLine();
        Room room = new Room(nameSevice, areaUse, price, person, daily, serviceId, freeSevice);
        facilityMap.put(room, 0);
    }

    @Override
    public void editRoom() {

    }

    @Override
    public void add() {

    }

    public void display() {
        for (Map.Entry<Facility, Integer> facilityIntegerEntry : facilityMap.entrySet()) {
            System.out.println(facilityIntegerEntry);
        }
    }
    boolean isDouble(String str){
        try {
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
    boolean isInt(String str2){
        try {
            Integer.parseInt(str2);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
