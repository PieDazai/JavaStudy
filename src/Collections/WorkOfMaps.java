package Collections;

import java.util.*;

public class WorkOfMaps {

    private static Map<String, Set<String>> names = new TreeMap<>();
    private static Map<String, Map<String, Integer>> FIO = new TreeMap<>();

    public static void main(String[] args) {

       // makeMap();
        makeSuperMap();

    }

    public static void addToList(String str, Set<String> set) {
            names.put(str, set);
        }
    public static void deleteToList(String str) {

            if (!names.containsKey(str)) {
                System.out.println("Not found");
                return;
            }
            names.remove(str);
        }
    public static void printList() {
            for (Map.Entry<String, Set<String>> entry : names.entrySet()) {
                System.out.println(entry.getKey());
                for (String s : entry.getValue()) {
                    System.out.println("\t" + s);
                }
            }
        }
    public static void makeMap() {
            Set<String> Nastya = new TreeSet<>();
            Nastya.add("Кушать");
            Nastya.add("Учиться");

            Set<String> Kirill = new TreeSet<>();
            Kirill.add("Кушать много");
            Kirill.add("Учить java");

            Set<String> Vasya = new TreeSet<>();
            Vasya.add("ничего");
            Vasya.add("тоже");

            addToList("Вася", Vasya);
            addToList("Настя", Nastya);
            addToList("Кирилл", Kirill);

            printList();
            deleteToList("Вася");
            deleteToList("Вас12я");
            printList();

        }

    public static void addToMap(String str, Map<String, Integer> map) {
        FIO.put(str, map);
    }
    public static void deleteToMap(String str){
        if (!FIO.containsKey(str)) {
            System.out.println("Not found");
            return;
        }
        FIO.remove(str);

    }
    public static void printToMap(){
        for (Map.Entry<String, Map<String, Integer>> entry : FIO.entrySet()){
            System.out.println(entry.getKey() + ":");

            for (Map.Entry<String, Integer> entry1 : entry.getValue().entrySet()){
                System.out.println(entry1.getKey() + " " +  entry1.getValue());
            }
        }

    }
    public static void makeSuperMap(){
        Map<String, Integer> Kirill = new TreeMap<>();
        Kirill.put("Кирилл", 19);

        Map<String, Integer> Nastya = new TreeMap<>();
        Nastya.put("Настя", 18);

        addToMap("Первое поле", Kirill);
        addToMap("Второе поле", Nastya);
        printToMap();
        deleteToMap("21312");
        deleteToMap("Первое поле");
        printToMap();

    }


    public static Map<String, Set<String>> getNames() {
        return names;
    }

    public static void setNames(Map<String, Set<String>> names) {
        WorkOfMaps.names = names;
    }

    public static Map<String, Map<String, Integer>> getFIO() {
        return FIO;
    }

    public static void setFIO(Map<String, Map<String, Integer>> FIO) {
        WorkOfMaps.FIO = FIO;
    }
}
