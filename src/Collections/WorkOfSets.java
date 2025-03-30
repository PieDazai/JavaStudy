package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WorkOfSets {

    private static Set<String> words = new TreeSet<>();
    private static Set<Integer> numbers = new HashSet<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите слово:");
            String word = scanner.nextLine();
            if(word.equals("print")){
                for(String s : words) System.out.println(s);
                continue;
            }

            if(word.matches("[А-я]+")){

                if(words.contains(word))
                    System.out.println("Слово уже есть");

                else words.add(word);
            }
            else System.out.println("Не слово!");
        }
    }
}
