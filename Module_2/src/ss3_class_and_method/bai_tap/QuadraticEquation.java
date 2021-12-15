package ss3_class_and_method.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = b*2 - 4*a*c;
        return delta;
    }
    public double getRoot1() {
        double r1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return r1;
    }
    public double getRoot2() {
        double r2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation);
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
        if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one roots: " + quadraticEquation.getRoot1());
        }
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        }
    }
}
