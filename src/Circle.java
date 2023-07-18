package src;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getCirclePerimeter() {
        getRadius();
        double circlePerimeter = 2 * radius * Math.PI;
        return circlePerimeter;
    }

    public double getArea() {
        getRadius();
        int power = 2;
        double area = Math.PI * Math.pow(radius, power);
        return area;
    }


}

