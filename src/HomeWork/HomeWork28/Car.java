package HomeWork.HomeWork28;

public class Car {
    private String mark;
    private int year;
    private double price;

    public Car(String mark, int year, double price) {
        this.mark = mark;
        this.year = year;
        this.price = price;
    }
    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
