package ss3_class_and_method.thuc_hanh.rectangle;

public class Rectangle {
    double width;
    double height;

    public Rectangle(){
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.width) * 2;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

