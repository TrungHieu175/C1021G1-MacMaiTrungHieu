package controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    static boolean checkChoice;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            checkChoice = false;
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
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
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
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
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
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
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
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
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
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
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
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