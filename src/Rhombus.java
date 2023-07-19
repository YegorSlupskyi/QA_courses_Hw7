package src;

public class Rhombus extends Parallelogram{

    public Rhombus(double side, double angleBetweenSides) {
        super(side, side, angleBetweenSides);
    }
    public double getSide() {
        return super.getTopSideLength();
    }
    @Override
    public double getPerimeter() {
        return getSide() * 4;
    }
}
