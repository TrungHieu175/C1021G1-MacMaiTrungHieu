package ss14_thuat_toan_sap_xep;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value: ");
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your list input");
        for (int t : list) {
            System.out.println(t);
        }
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean check = true;
        for (int k = 1; k < list.length && check; k++) {
            check = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the  " + k + "' sort: ");
            for (int l : list) {
                System.out.print(l + "\t");
            }
        }
    }
}
