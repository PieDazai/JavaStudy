package HomeWork.HomeWork21.o;

public class Circle implements  Shape {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
