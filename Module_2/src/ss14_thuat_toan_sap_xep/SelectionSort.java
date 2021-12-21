package ss14_thuat_toan_sap_xep;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter size value: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] list = new double[size];
        System.out.println("Enter index in array: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextDouble();
        }
        System.out.println("Your list input: ");
        for (double l : list) {
            System.out.print(l + "\t");
        }
        selectionSort(list);
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        System.out.println();
        System.out.println("SelectionSort array list: ");
        for (double i : list) {
            System.out.print(i + "\t");
        }
    }
}
