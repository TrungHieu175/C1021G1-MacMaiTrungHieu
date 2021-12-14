package ss2_loop_array.thuc_hanh.tim_phan_tu_mang;

import java.util.Scanner;

public class Timphantutrongmang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is " + i);
                isExits = true;
                break;
            }
            }
        if (!isExits) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
