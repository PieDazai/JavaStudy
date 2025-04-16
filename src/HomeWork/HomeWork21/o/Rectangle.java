package HomeWork.HomeWork21.o;

public class Rectangle implements  Shape {
    private double width;
    private double height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}
