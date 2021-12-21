package ss4_access_modifier_static_method_static_property.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "black");
        System.out.println("Is Circle: " + circle);
        System.out.println("Is radius: " + circle.getRadius());
        System.out.println("Is area: " + circle.getArea());
        circle.setRadius(2.2);
        System.out.println("New radius: " + circle.getRadius());
        System.out.println("New area: " + circle.getArea());
    }
}
