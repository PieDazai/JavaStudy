package HomeWork;

import java.util.*;

public class HomeWork24 {

    private static final String REGEX_NUMBER_10DIGITS = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    private static final String REGEX_NAME = "[А-я]+";
    private static final Map<String, Set<String>> phoneBook = new TreeMap<>();

    public static void main(String[] args) {

        System.out.println("""
                Добро пожаловать в телефонную книгу!
                Для печати всего списка "Печать"
                Для выхода из программы "Выход"
                Для поиска имени по номеру или для получения
                списка номеров абенента - введите "Найти"
                затем впишите имя или номер
                """);

        while (true){
            System.out.println("Введите номер, имя или команду:\n");
            String input = new Scanner(System.in).nextLine().trim();

            if(input.matches("\\D+") && !input.isEmpty()) {
                if(input.equalsIgnoreCase("Печать")){
                    printPhoneBook();
                } else if (input.equalsIgnoreCase("Выход")) {
                    System.out.println("Exit...");
                    return;
                }
                else if(input.equalsIgnoreCase("Найти")){
                    inputFind();
                }
                else if (input.matches(REGEX_NAME))
                    addToPhoneBookByName(input);
                else
                    System.out.println("Не верный ввод!");
            }
            else {
               addToPhoneBookByNumber(input);
            }
        }
    }

    public static void printPhoneBook(){
        if (phoneBook.isEmpty()){
            System.out.println("Книга пуста!");
            return;
        }
        for(Map.Entry<String, Set<String>> entry : phoneBook.entrySet()){
            System.out.print("Имя: " + entry.getKey() + "\nномер(а): \n");
            for(String numbers : entry.getValue())
                System.out.println("\t" + numbers);
            System.out.println();
        }
    }

    public static void addToPhoneBookByName(String name) {
        System.out.println("Введите номер для " + name);
        String inputNumber = new Scanner(System.in).nextLine().trim();
        String number = numberFormat(inputNumber);
        if(containsNumberOthers(number)){
            getNameByNumber(number);
            return;
        }

        if(number.isEmpty()) {
            System.out.println("Не корректный ввод номера");
            return;
        }
        addByName(name, number);
    }

    public static void addToPhoneBookByNumber(String number) {
        number = numberFormat(number);
        if(number.isEmpty()) {
            System.out.println("Не корректный ввод номера");
            return;
        }
        if(containsNumberOthers(number)) {
            getNameByNumber(number);
            return;
        }

        addByNumber(number);

    }

    public static String numberFormat(String input){
        String newNumber = "";
        String number = input.replaceAll("\\D", "");
            if (number.length() > 11 || number.length() < 10) return newNumber;
            if (number.length() == 11) number = number.substring(1);
            newNumber = number.replaceAll
                    (REGEX_NUMBER_10DIGITS,
                            "+7 ($1) $2 $3-$4");
        return newNumber;
    }

    public static boolean containsNumberOthers(String number) {
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            if((entry.getValue().contains(number)))
                return true;
        }
        return false;
    }

    public static void addByName(String name, String number){
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
            System.out.println("Добавлен номер: " + number + ", к имени: " + name);
            return;
        }
        Set<String> sets = new TreeSet<>();
        sets.add(number);
        phoneBook.put(name, sets);
        System.out.println("Добавлен номер: " + number + ", к имени: " + name);
    }

    public static void addByNumber(String number){
        System.out.println("Введите имя, к которому добавить номер: ");
        String name = new Scanner(System.in).nextLine().trim();
        if(!name.matches(REGEX_NAME)){
            System.out.println("Не верное имя!");
            return;
        }

        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
            System.out.println("Добавлен номер: " + number + ", к имени: " + name);
            return;
        }
        Set<String> sets = new TreeSet<>();
        sets.add(number);
        phoneBook.put(name, sets);
        System.out.println("Добавлен номер: " + number + ", к имени: " + name);
    }

    public static void getNameByNumber(String number){
        number = numberFormat(number);
        for(Map.Entry<String, Set<String>> entry : phoneBook.entrySet()){
            if(entry.getValue().contains(number)){
                System.out.println("Номер: " + number + ", принаддлежит абоненту: " + entry.getKey());
                return;
            }
        }
    }

    public static void getNumbersByName(String name){

        if(!phoneBook.containsKey(name)){
            System.out.println("Такого имени нет в списке!");
            return;
        }
        System.out.println("Номер(а) для имени " + name + ":");
        for (String numbers : phoneBook.get(name))
            System.out.println("\t" + numbers);
        System.out.println();
    }

    public static void inputFind(){
        System.out.println("Ведите имя или номер:\n");
        String input = new Scanner(System.in).nextLine().trim();
        if(input.matches(REGEX_NAME)) {
            getNumbersByName(input);
            return;
        }
        input = numberFormat(input);
        getNameByNumber(input);
    }
}
