package ss6_inheritance.thuc_hanh.controler;

import ss6_inheritance.thuc_hanh.main.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("green",false);
        System.out.println(shape);
    }
}
