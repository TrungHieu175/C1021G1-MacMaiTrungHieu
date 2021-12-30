package controllers;

import models.facility.Facility;
import models.person.Employee;
import services.CustomerServiceImpl;
import services.EmployeeServiceImpl;
import services.FacilityServiceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    public static final String THUT = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
    static int choice;
    static boolean checkChoice;
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What's up--");
            System.out.println(THUT + "(^_-) Furama resort management menu (-_^)");
            System.out.println(THUT + "1. Employee management");
            System.out.println(THUT + "2. Customer management");
            System.out.println(THUT + "3. Facility management");
            System.out.println(THUT + "4. Booking management");
            System.out.println(THUT + "5. Promotion management");
            System.out.println(THUT + "6 Exit");
            System.out.println();
            System.out.println(THUT + "(^_-)___________(-_^)");
            System.out.println(THUT + "Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                ;
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                case 6:
                    System.exit(0);
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    break;
            }
        } while (checkChoice);
    }

    public static void employeeManagement() {
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What's up--");
            System.out.println(THUT +"1. Display list employees");
            System.out.println(THUT +"2. Add new employees");
            System.out.println(THUT +"3. Edit employees");
            System.out.println(THUT +"4. Return main menu");
            System.out.println();
            System.out.println(THUT +"(^_-)___________(-_^)");
            System.out.println(THUT +"Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    employeeService.display();
                    checkChoice = true;
                    continue;
                case 2:
                    employeeService.add();
                    checkChoice = true;
                    continue;
                case 3:
                    employeeService.edit();
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void customerManagement() {
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What's up--");
            System.out.println(THUT +"1. Display list customers");
            System.out.println(THUT +"2. Add new customers");
            System.out.println(THUT +"3. Edit customers");
            System.out.println(THUT +"4. Return main menu");
            System.out.println();
            System.out.println(THUT +"(^_-)___________(-_^)");
            System.out.println(THUT +"Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    customerService.display();
                    checkChoice = true;
                    continue;
                case 2:
                    customerService.add();
                    checkChoice = true;
                    continue;
                case 3:
                    customerService.edit();
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void facilityManagement() {
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What's up--");
            System.out.println(THUT +"1. Display list facility");
            System.out.println(THUT +"2. Add new facility");
            System.out.println(THUT +"3. Edit facility");
            System.out.println(THUT +"4. Return main menu");
            System.out.println();
            System.out.println(THUT +"(^_-)___________(-_^)");
            System.out.println(THUT +"Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    checkChoice = true;
                    continue;
                case 2:
                    menuFacility();
                    checkChoice = true;
                    continue;
                case 3:
                    //
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }
    public static void menuFacility(){
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What's up--");
            System.out.println(THUT +"1. Add New Villa");
            System.out.println(THUT +"2. Add New House");
            System.out.println(THUT +"3. Add New Room");
            System.out.println(THUT +"4. Return main menu");
            System.out.println();
            System.out.println(THUT +"(^_-)___________(-_^)");
            System.out.println(THUT +"Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    facilityService.add();
                    checkChoice = true;
                    continue;
                case 2:
                    //
                    checkChoice = true;
                    continue;
                case 3:
                    //
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void bookingManagement() {
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What's up--");
            System.out.println(THUT +"1. Add new booking");
            System.out.println(THUT +"2. Display list booking");
            System.out.println(THUT +"3. Create new contracts");
            System.out.println(THUT +"4. Display list contract");
            System.out.println(THUT +"5. Edit contract");
            System.out.println(THUT +"6. Return main menu");
            System.out.println();
            System.out.println(THUT +"(^_-)___________(-_^)");
            System.out.println(THUT +"Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    //
                    checkChoice = true;
                    continue;
                case 2:
                    //
                    checkChoice = true;
                    continue;
                case 3:
                    //
                    checkChoice = true;
                    continue;
                case 4:
                    //
                    checkChoice = true;
                    continue;
                case 5:
                    //
                    checkChoice = true;
                    continue;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    public static void promotionManagement() {
        do {
            checkChoice = false;
            System.out.println(THUT +"--Hello What'up--");
            System.out.println(THUT +"1. Display list customers use service");
            System.out.println(THUT +"2. Display list customers get voucher");
            System.out.println(THUT +"3. Return main menu");
            System.out.println();
            System.out.println(THUT +"(^_-)___________(-_^)");
            System.out.println(THUT +"Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You dump bro?");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    //
                    checkChoice = true;
                    continue;
                case 2:
                    //
                    checkChoice = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("You dump bro?");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }
}