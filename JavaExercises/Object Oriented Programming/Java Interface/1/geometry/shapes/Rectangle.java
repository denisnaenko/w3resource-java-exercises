package geometry.shapes;

public class Rectangle implements Shape{
    public double height;
    public double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
    }
}
