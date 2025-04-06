package HomeWork;

import java.util.List;
import java.util.Objects;

public class Book implements Printable {

    private int year;
    private  String name;
    @Override
    public void print() {
        System.out.println("навзание книги: " + name);
    }

    public static void printBooks(List<Printable> printable){
        for(Printable book : printable) {
            if (book instanceof Book)
                System.out.println(book);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "название: " + name + ", года выпуска: " + year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
    }


}
