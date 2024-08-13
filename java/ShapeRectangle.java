package dp;

class Rectangle {
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double Area() {
        return width * height;
    }
    double Perimeter() {
        return 2 * (width + height);
    }
    void display() {
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}

public class ShapeRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        rectangle.display();
    }
}

