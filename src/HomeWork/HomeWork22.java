package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork22 {

    private static List<String> toDoes = new ArrayList<>();
    private static final String ADD_BY_INDEX = "(\\d+)(\\s)(.+)";

    public static void main(String[] args) {

        System.out.println("\t\tДобро пожаловать в программу управления делами!");
        String info = "Доступные команды:\n" +
                "Добавить {дело}\n" +
                "Добавить {индекс} {дело}\n" +
                "Удалить {индекс}\n" +
                "Изменить {индекс} {дело}\n" +
                "Печать\n" +
                "Информация\n" +
                "Выход\n";
        System.out.println(info);


        String command, toDo;

        while (true){
            String input = new Scanner(System.in).nextLine().trim();

            if (input.contains(" ")) {
                String[] inputs = input.split("\\s", 2);
                command = inputs[0];
                toDo = inputs[1];

                System.out.println("command = " + command);
                System.out.println("toDo = " + toDo);
            }
            else {
                command = input;
                toDo = "";
            }

            if(command.equalsIgnoreCase("Добавить")) {
                boolean isMatches = toDo.matches(ADD_BY_INDEX);
                System.out.println("is math = " + isMatches);
                if (isMatches){
                    int indexAdd = Integer.parseInt(toDo.split("\\s", 2)[0]);
                    String doesAdd = toDo.split("\\s", 2)[1];
                    addToListByIndex(doesAdd, indexAdd);
                }
                else {
                    addToList(toDo);
                }
            }
            else if(command.equalsIgnoreCase("Удалить")) {
                int indexDelete = Integer.parseInt(toDo);
                deleteToListByIndex(indexDelete);
            }
            else if (command.equalsIgnoreCase("Изменить")) {
                int indexChange = Integer.parseInt(toDo.split("\\s", 2)[0]);
                String doesChange = toDo.split("\\s", 2)[1];
                changeToDoByIndex(indexChange, doesChange);
            }
            else if (command.equalsIgnoreCase("Печать"))
                printAllToDo();
            else if(command.equalsIgnoreCase("Выход")) {
                System.out.println("Выход из программы");
                return;
            }
            else System.out.println(info);
        }

    }

    static void addToList(String toDo){
        if(toDoes.contains(toDo)){
            System.out.println("Дело уже содержится");
            return;
        }
        System.out.println("Дело " + toDo + " добавлено");
        toDoes.add(toDo);
    }

    static void addToListByIndex(String toDo, int index){
        if(toDoes.contains(toDo)){
            System.out.println("Дело уже содержится");
            return;
        }
        try {
            toDoes.add(index, toDo);
            System.out.println("Дело " + toDo + " добавлено в список на позицию " + index);

        }
        catch (Exception e){
            System.out.println("\nИндекс вышел за перделы листа:");
            System.out.println("Дело " + toDo + " добавлено в конец списка");
            toDoes.add(toDo);
        }
    }

    static void deleteToListByIndex(int index){
        try {
            toDoes.remove(index);
            System.out.println("Дело под индексом " + index + " удалено");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Индекс вышел за перделы листа, нельзя удалить");
        }
    }

    static void changeToDoByIndex(int index, String toDo){
        try {
            toDoes.set(index, toDo);
            System.out.println("Дело под индексом " + index  + " изменено на " + toDo);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Такого индекса нет в листе, нельзя изменить");
        }

    }

    static void printAllToDo(){
        toDoes.forEach(System.out::println);
    }
}
