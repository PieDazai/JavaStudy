package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Season mySeason = Season.SPRING;
        System.out.println(mySeason.getAverageTemp());
        System.out.println(mySeason.getDescription());

        Season[] ses = new Season[]{Season.AUTUMN, Season.SPRING, Season.SUMMER, Season.WINTER};

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemp() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
