package ss2_loop_array.bai_tap.hien_thi_20_so_nguyen_to;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("%d Is primenumber: \n" + n);
        int count = 0;
        int i = 2;
//        while (count < n) {
//            if (isPrimeNumber(i)) {
//                System.out.println(i + " ");
//                count++;
//            }
//            i++;
//        }
        for (count = 2; count < n; count++) {
            if (isPrimeNumber(count)) {
                System.out.println(count + " ");
            }
        }


    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
