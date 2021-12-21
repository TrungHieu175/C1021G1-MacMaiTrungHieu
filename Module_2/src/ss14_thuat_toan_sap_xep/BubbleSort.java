package ss14_thuat_toan_sap_xep;

public class BubbleSort {
    static int[] list = {6, 2, 5, 8, 3, 15, 5, 7, 1};
    public static void bubbleSort(int[] list) {
        boolean check = true;
        for (int k = 1; k < list.length && check; k++) {
            check = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int l: list) {
            System.out.println(l + "");
        }
    }
}