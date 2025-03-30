package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWork {

      private static List<String> listNumber = new ArrayList<>();


      public static void addToList(String str){
        listNumber.add(str);
      }

      public static void deleteToList(String str){
         if(!listNumber.contains(str)){
             System.out.println("Not found");
             return;
          }
         listNumber.remove(str);
      }

      public static void printList(){
          for(String s : listNumber) System.out.println(s + " ");
      }

      public static void printByIndex(Integer index){
          if(!listNumber.contains(listNumber.get(index))){
              System.out.println("Not found");
              return;
          }
          System.out.println(listNumber.get(index));
      }

    public static void main(String[] args) {
       addToList("hello");
       addToList("hello1");
       addToList("hello2");
       addToList("hello3");
       printList();

       deleteToList("hellj1");
       deleteToList("hello1");
       printList();

       printByIndex(1);
    }




}
