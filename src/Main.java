package src;

public class Main {
    public static void main(String[] args) {
        circle();

        try {
            triangle();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            rectangularTriangle();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            isoscelesTriangle();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            equilateralTriangle();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void circle() {
        Circle circle1 = new Circle(4);
        circle1.getCirclePerimeter();
        System.out.println("Perimeter of the circle = " + circle1.getCirclePerimeter() + " cm");
        circle1.getArea();
        System.out.println("Area of the circle = " + circle1.getArea() + " cm");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void triangle() throws Exception {
        Triangle firstTriangle = new Triangle(8, 16, 22);
        System.out.println("firstTriangle = " + firstTriangle.toString());
        System.out.println("Perimeter of the common triangle = " + firstTriangle.getTrianglePerimeter() + " cm");
        System.out.println("Area of the common triangle = " + firstTriangle.getArea() + " cm");

        System.out.println("Angle A = " + firstTriangle.getAngleA() + "°");
        System.out.println("Angle B = " + firstTriangle.getAngleB() + "°");
        System.out.println("Angle C = " + firstTriangle.getAngleC() + "°");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void rectangularTriangle() throws Exception {
        RectangularTriangle firstRectangularTriangle = new RectangularTriangle(3, 4);
        System.out.println("firstRectangularTriangle = " + firstRectangularTriangle.toString());

        System.out.println("Hypotenuse = " + firstRectangularTriangle.getHypotenuse() + " cm");

        System.out.println("Perimeter of the Rectangular triangle = " + firstRectangularTriangle.getTrianglePerimeter() + " cm");
        System.out.println("Area of the Rectangular triangle = " + firstRectangularTriangle.getArea() + " cm²");

        System.out.println("Angle A = " + firstRectangularTriangle.getAngleA() + "°");
        System.out.println("Angle B = " + firstRectangularTriangle.getAngleB() + "°");
        System.out.println("Angle C = " + firstRectangularTriangle.getAngleC() + "°");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void isoscelesTriangle() throws Exception {
        IsoscelesTriangle firstIsoscelesTriangle = new IsoscelesTriangle(7, 10);
        System.out.println("firstIsoscelesTriangle = " + firstIsoscelesTriangle.toString());
        System.out.println("Area of the Isosceles triangle = " + firstIsoscelesTriangle.getArea() + " cm²");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void equilateralTriangle() throws Exception {
        EquilateralTriangle firstEquilateralTriangle = new EquilateralTriangle(5);
        System.out.println("firstEquilateralTriangle = " + firstEquilateralTriangle.toString());
        System.out.println("Angle = " + firstEquilateralTriangle.getAngle() + "°");
        System.out.println("Area of the Equilateral triangle = " + firstEquilateralTriangle.getArea() + " cm²");
    }
}
