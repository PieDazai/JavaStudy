package HomeWork;

import java.util.List;
import java.util.Objects;

public class Magazine implements Printable {

    private String name;
    public static void printMagazines(List<Printable> printable){
        for(Printable mag : printable) {
            if (mag instanceof Magazine)
                System.out.println(mag);
        }
    }

    @Override
    public void print() {
        System.out.println("навзание журнала: " + getName());
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
