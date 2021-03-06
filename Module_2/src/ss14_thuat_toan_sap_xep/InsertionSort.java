package ss14_thuat_toan_sap_xep;

import java.util.Scanner;

public class InsertionSort {
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
        System.out.println();
        System.out.println("Sorted array");
        insertionSort(list);
        for (double l : list) {
            System.out.print(l + "\t");
        }
    }
    public static void insertionSort(double[] arr) {
        double x;
        int pos;
            for (int i = 1; i < arr.length; i++) {
                pos = i;
                x = arr[i];
                for (; pos > 0 && arr[pos -1] > x; pos--){
                    arr[pos] = arr[pos - 1];
                }
                arr[pos] = x;
            }
        }
    }
