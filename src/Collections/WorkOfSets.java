package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class WorkOfSets {

    private static Set<String> words = new TreeSet<>();
    private static Set<Integer> numbers = new HashSet<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        words.add("asdfd");
        words.add("asd2321fd");
        words.add("asdf323d");
        words.add("aasdr23erwffd");
        words.stream().filter(x -> x.contains("r")).forEach(System.out::println);
        List<String> www = words.stream().toList();
        www.forEach(System.out::println);
        www.stream().sorted();
        System.out.println("-----------------");
        www.forEach(System.out::println);

//        while (true){
//            System.out.println("Введите слово:");
//            String word = scanner.nextLine();
//            if(word.equals("print")){
//                for(String s : words) System.out.println(s);
//                continue;
//            }
//
//            if(word.matches("[А-я]+")){
//
//                if(words.contains(word))
//                    System.out.println("Слово уже есть");
//
//                else words.add(word);
//            }
//            else System.out.println("Не слово!");
//        }
    }
}
