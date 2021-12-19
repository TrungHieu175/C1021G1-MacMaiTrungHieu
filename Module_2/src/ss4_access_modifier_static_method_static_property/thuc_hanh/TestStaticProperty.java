package ss4_access_modifier_static_method_static_property.thuc_hanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Tho","Dap xe");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Xe kut kit","lan");
        System.out.println(Car.numberOfCars);
    }
}
