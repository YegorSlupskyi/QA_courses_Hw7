package src;

import src.Tetragon.*;
import src.Triangle.EquilateralTriangle;
import src.Triangle.IsoscelesTriangle;
import src.Triangle.RectangularTriangle;
import src.Triangle.Triangle;

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
        tetragon();
        square();
        rectangle();
        parallelogram();
        try {
            trapezium();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        rhombus();
    }

    public static void circle() {
        Circle circle1 = new Circle(4);
        System.out.println("Radius of the circle = " + circle1.getRadius() + " cm");
        circle1.getArea();
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
        System.out.println("____________________________");
        System.out.println();
    }

    public static void tetragon() {
        Tetragon theFirstTetragon = new Tetragon(
                new Point(0, 0),
                new Point(0, 4),
                new Point(4, 4),
                new Point(4, 0)
        );
        System.out.println("theFirstTetragon = " + theFirstTetragon.toString());
        System.out.println("TopSideLength = " + theFirstTetragon.getTopSideLength() + " cm");
        System.out.println("BottomSideLength = " + theFirstTetragon.getBottomSideLength() + " cm");
        System.out.println("LeftSideLength = " + theFirstTetragon.getLeftSideLength() + " cm");
        System.out.println("RightSideLength = " + theFirstTetragon.getRightSideLength() + " cm");
        System.out.println("Perimeter = " + theFirstTetragon.getPerimeter() + " cm");
        System.out.println("Area of the FirstTetragon = " + theFirstTetragon.getArea() + " cm²");
        System.out.println("BottomLeftAngle = " + theFirstTetragon.getBottomLeftAngle() + "°");
        System.out.println("TopLeftAngle = " + theFirstTetragon.getTopLeftAngle() + "°");
        System.out.println("TopRightAngle = " + theFirstTetragon.getTopRightAngle() + "°");
        System.out.println("BottomRightAngle = " + theFirstTetragon.getBottomRightAngle() + "°");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void square() {
        Square theFirstSquare = new Square(6);
        System.out.println("All sides are equal = " + theFirstSquare.getSide() + " cm");
        System.out.println("All angles are equal = " + theFirstSquare.getAngle() + "°");
        System.out.println("Perimeter = " + theFirstSquare.getPerimeter() + " cm");
        System.out.println("Area of the FirstSquare = " + theFirstSquare.getArea() + " cm²");
        System.out.println("____________________________");
        System.out.println();

    }

    public static void rectangle() {
        Rectangle theFirstRectangle = new Rectangle(2, 6);
        System.out.println("Side A = " + theFirstRectangle.getSideA() + " cm");
        System.out.println("Side B = " + theFirstRectangle.getSideB() + " cm");
        System.out.println("All angles are equal = " + theFirstRectangle.getAngle() + "°");
        System.out.println("Perimeter = " + theFirstRectangle.getPerimeter() + " cm");
        System.out.println("Area of the FirstSquare = " + theFirstRectangle.getArea() + " cm²");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void parallelogram() {
        Parallelogram theFirstParallelogram = new Parallelogram(2, 6, Math.PI / 2);
        System.out.println("Side A = " + theFirstParallelogram.getSideA() + " cm");
        System.out.println("Side B = " + theFirstParallelogram.getSideB() + " cm");
        System.out.println("Perimeter = " + theFirstParallelogram.getPerimeter() + " cm");
        System.out.println(theFirstParallelogram.getSideD());
        System.out.println(theFirstParallelogram.getBottomLeftAngle());
        System.out.println(theFirstParallelogram.getTopLeftAngle());
        System.out.println(theFirstParallelogram.getTopRightAngle());
        System.out.println(theFirstParallelogram.getBottomRightAngle());
        System.out.println("Area of the FirstParallelogram = " + theFirstParallelogram.getArea() + " cm²");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void trapezium() throws Exception {
        Trapezium theFirstTrapezium = new Trapezium(
                new Point(0, 0),
                new Point(3, 4),
                new Point(7, 4),
                new Point(10, 0));
        System.out.println( theFirstTrapezium.toString());
        System.out.println("Area of theFirstTrapezium = " + theFirstTrapezium.getArea() + " cm²");
        System.out.println("____________________________");
        System.out.println();
    }

    public static void rhombus(){
        Rhombus theFirstRhombus = new Rhombus (1.41421356, Math.PI/2);
        System.out.println("All sides are equal = " + theFirstRhombus.getSide() + " cm");
        System.out.println("Area of the Rhombus = " + theFirstRhombus.getArea() + " cm²");
    }

}
