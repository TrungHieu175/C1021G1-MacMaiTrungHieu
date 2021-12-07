package ss1_introduction_in_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd;
        double usd;
        System.out.println("Enter USD wanna change: ");
        usd = sc.nextDouble();
        System.out.println("Enter VND wanna change: ");
        vnd = sc.nextDouble();
        double changeVnd = vnd / 23000;
        double changeUsd = usd * 23000;
        System.out.println("USD to VND = " + changeUsd);
        System.out.println("VND to USD = " + changeVnd);
    }
}
