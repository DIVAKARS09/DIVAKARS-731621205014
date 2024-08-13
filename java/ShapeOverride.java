package dp;

class Shape {
    double getArea() {
        return 0.0;
    }
}
class rec extends Shape {
    double width;
    double height;
    rec(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
}
public class ShapeOverride {
    public static void main(String[] args) {
        rec r = new rec(5, 10);
        System.out.println("Area=" + r.getArea());  
    }
}