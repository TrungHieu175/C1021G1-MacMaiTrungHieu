package ss2_loop_array.thuc_hanh.tim_gia_tri_nho_nhat;

import java.util.Scanner;

public class Timgiatrinhonhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Propety list: ");
        for(int a : array) {
            System.out.print(a + "\t");
        }
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + index);
    }
    public static int minValue(int[] array){
        int index = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < index) {
                index = array[j];
            }
        }
        return index;
    }
}