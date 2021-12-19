package ss4_access_modifier_static_method_static_property.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
       double area = Math.PI * (radius * radius);
       return area;
    }
}
