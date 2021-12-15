package ss3_class_and_method.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST  = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean o) {
        this.on = o;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

    }

    @Override
    public String toString() {
        if(this.isOn()){
            return "Speed: " + this.getSpeed() +
                    " Color: " + this.getColor() +
                    " Radius: " + this.getRadius() +
                    " Status: fan is on " + this.isOn();
        }else {
            return " Color: " + this.getColor() +
                    " Radius: " + this.getRadius() +
                    " Status: Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1);
        fan2.setSpeed(fan1.getMEDIUM());
        System.out.println(fan2);
    }
}
