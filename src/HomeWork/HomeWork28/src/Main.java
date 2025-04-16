package HomeWork.HomeWork28.src;

import HomeWork.HomeWork28.Car;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final int KB_SIZE = 1024;
    private static final int MB_SIZE = KB_SIZE * 1024;
    private static final int GB_SIZE = MB_SIZE * 1024;

    public static void main(String[] args) {
        System.out.println("============= ДЗ 2 =============");
        System.out.println("Введите путь к файлу или папке: ");
        String path = new Scanner(System.in).nextLine();
        printSize(path);

        System.out.println("============= ДЗ 3 =============");
        setSale();
    }

    private static void printSize(String path) {
        //todo Дописать код расчета размера и корректного отображения
        File file = new File(path);
        if (!file.canRead()) {
            System.out.println("Не верный путь файла!");
            return;
        }
        long size;
        if(file.isFile()){
            size = file.length();
        }
        else {
            try {
                size = Files.walk(Path.of(path)).filter(f -> f.toFile().
                        isFile()).mapToLong(f -> f.toFile().length()).sum();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        convertSize(size);
    }

    private static void setSale() {
        //todo Тут написать код для ДЗ #3
        try {
            List<String> carList = Files.readAllLines
                    (Path.of("src/HomeWork/HomeWork28/data/car_price.txt"));
            List<Car> cars = new ArrayList<>();
            carList.forEach(f -> {
                String mark = f.split("\\s", 3)[0];
                int year = Integer.parseInt(f.split("\\s", 3)[1]);
                double price = Double.parseDouble(f.split("\\s", 3)[2]);
                cars.add(new Car(mark, year, price));
            });

            LocalDate now = LocalDate.now();
            List<String> newCarsWrite = cars.stream().map(s -> {
                int age = now.getYear() - s.getYear();
                double priseWithSale = age > 5 ? 0.05 : 0.02;
                double newPrice = s.getPrice() * (1 - priseWithSale);
                return s.getMark() + " " + s.getYear() + " " + newPrice;
            }).collect(Collectors.toList());

           Files.write(Path.of("src/HomeWork/HomeWork28/data/2_car_price.txt"), newCarsWrite);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void convertSize(double size){
        if(size <= KB_SIZE)
            System.out.printf("Размер файла в байтах: %.2f\n", size);
        else if (size <= MB_SIZE)
            System.out.printf("Размер файла в килобайтах: %.2f\n", size / KB_SIZE);
        else if (size <= GB_SIZE)
            System.out.printf("Размер файла в мегабайтах: %.2f\n", size / MB_SIZE);
        else
            System.out.printf("Размер файла в гигабайтах: %.2f\n", size / GB_SIZE);

    }
}
