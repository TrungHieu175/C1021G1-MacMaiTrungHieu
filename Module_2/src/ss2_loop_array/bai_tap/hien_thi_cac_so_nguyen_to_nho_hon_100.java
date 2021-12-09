package ss2_loop_array.bai_tap;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i + " ");
            }
        }
        int num = 5;
        do {
            System.out.print("CodeGym ");
        } while (num < 5);
    }
    public static boolean checkPrime (int n) {
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
