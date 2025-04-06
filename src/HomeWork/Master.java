package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Master {

    public static void main(String[] args) {

        Printable book1 = new Book(1990, "book1");
        Printable book3 = new Book(1990, "book1");
        Printable book2 = new Book(2006,"book2");

        Printable magazine1 = new Magazine("magazine1");
        Printable magazine2 = new Magazine("magazine2");

        List<Printable> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(magazine1);
        list.add(magazine2);

        for(Printable p : list) p.print();

        Book.printBooks(list);

        System.out.println(book1.equals(book3));



    }
}
