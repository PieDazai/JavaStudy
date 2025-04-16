package HomeWork;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork23 {

    private static final Set<String> setNumbers = new TreeSet<>();

    private static final String REGEX_NUMBER_10DIGITS = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";

    public static void main(String[] args) {

        System.out.println("""
                Программа для записи номеров!
                 Для выхода из программы напишите "Выход"
                Для просмотра всего списка напишите "Печать\"""");

        while (true){
            System.out.println("Введите номер телефона: \n");
            String input = new Scanner(System.in).nextLine().trim();

            if(input.equalsIgnoreCase("выход")) {
                System.out.println("Exit");
                return;
            }
            else if (input.equalsIgnoreCase("печать")){
                printNumbers();
            }
            else {
                String number = input.replaceAll("\\D", "");
                if (number.length() > 11 || number.length() < 10) {
                    System.out.println("Не верный ввод, попробуйте снова: \n");
                    continue;
                }
                if (number.length() == 11) number = number.substring(1);
                addNumberToList(number);
            }
        }
    }

    public static void printNumbers(){
        if (setNumbers.isEmpty()){
            System.out.println("Список пуст!");
            return;
        }
        System.out.println("Список номеров:");
        setNumbers.forEach(System.out::println);
    }

    public static void addNumberToList(String number) {
        String newNumber = number.replaceAll
                (REGEX_NUMBER_10DIGITS,
                        "+7 ($1) $2 $3-$4");
        if (setNumbers.contains(newNumber)) {
            System.out.println("Номер уже есть в списке!");
            return;
        }
            setNumbers.add(newNumber);
            System.out.println("Номер успешно добавлен!");
    }
}
