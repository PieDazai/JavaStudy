package HomeWork;

import HomeWork.HomeWork20.*;
import HomeWork.HomeWork25.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainHomeWork {

    public static void main(String[] args) {

        // Hw20();
        // Hw25();

    }

    static void Hw20(){
        List<Instruments> instrumentsList = new ArrayList<>();

        Musician musician = new Musician();

        Instruments guitar = new Guitar();
        Instruments piano = new Piano();
        Instruments flute = new Flute();

        instrumentsList.add(guitar);
        instrumentsList.add(flute);
        instrumentsList.add(piano);

        instrumentsList.forEach(musician::perform);
    }
    static void Hw25(){
        Supplier<Human> makeHuman = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя человека: ");
            String name = sc.nextLine().trim();
            System.out.println("Введите возраст человека: ");
            int age = sc.nextInt();
            System.out.println("Введите рост человека: ");
            double height = sc.nextDouble();

            return new Human(name, age, height);
        };

        Human human1 = makeHuman.get();
        Human human2 = makeHuman.get();

        Predicate<Integer> isOld = (x) -> x >= 18;
        System.out.println(isOld.test(human1.getAge()));
        System.out.println(isOld.test(human2.getAge()));
    }
}
