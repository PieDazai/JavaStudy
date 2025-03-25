import Pc.Class.*;
import Pc.Enums.*;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Main {

    private static final String reg = "([А-яёЁ-]+\\s){2}([А-яёЁ-]+)";
    private  static final String FIND_REG_NUMBER = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";

    public static void main(String[] args) {

//        Processor processor = new Processor(Gerc.THREE_GERC, CoreCount.EIGHT_COUNT, Maker.RUSSIA, 400);
//        Corememory corememory = new Corememory(Typememory.DDR4, 30, 500);
//        Harddisk harddisk = new Harddisk(TypeDisk.SSD, 1024, 300);
//        Display display = new Display(50.5, 1200, Typedisplay.VA);
//        Keyboard keyboard = new Keyboard(Typekeyboard.PROVOD, 600, IsPodsvetka.YES_SVET);
//
//        Computer pc = new Computer(processor, corememory, harddisk, display, keyboard);
//        pc.weightcount();
//        System.out.println(pc);
//
//        NAME_REG();
//        NumberReg();

        Wine wine1 = new Wine("vodka", "5 ozer", "RUSSIA", "водка лучшая",
                LocalDate.of(2006, 1, 14));

        //wine1.YearWine(LocalDate.now());
        //System.out.println(wine1.getOpisanie());
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat formatt = new SimpleDateFormat("dd MMMM yyyy ___ H:mm:ss", Locale.JAPAN);
        String formDate = formatt.format(date);
        System.out.println(formDate);


        System.out.println("Calendar");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, -7);
        System.out.println(calendar.getTime());

        LocalTime lct = LocalTime.of(12, 2, 3);
        System.out.println(lct);
        LocalDateTime lcdt = LocalDateTime.of(2006, Month.AUGUST, 1, 8, 58, 32);
        System.out.println(lcdt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));

        LocalDate loc = LocalDate.now();
        System.out.println(loc.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        ZonedDateTime zoneData = ZonedDateTime.now();
        System.out.println(zoneData);

        }

    public static void NAME_REG(){
      String input = new Scanner(System.in).nextLine().trim();

      if (!input.matches(reg)){
          System.out.println("NO INPUT");
      }
      else {
          input = input.replaceAll(("\\w+"), " ");
          String [] str = input.split(" ");
          System.out.println("Фамилия: " + str[0]);
          System.out.println("Имя: " + str[1]);
          System.out.println("Отчество: " + str[2]);


      }

    }

    public static  void NumberReg(){
        //+7 (999) 888 77-66
            String number = new Scanner(System.in).nextLine().trim();
            number = number.replaceAll("\\D", "");
            System.out.println(number);

            if (number.length() == 11) {
                if (number.matches("^([78]).*")) {

                    number = number.replaceAll("(\\d)" + FIND_REG_NUMBER,
                            "+7 ($2) $3 $4-$5");
                    System.out.println(number);
                } else System.out.println("No correct input number");

            } else if (number.length() == 10) {
                number = number.replaceAll(FIND_REG_NUMBER,
                        "+7 ($1) $2 $3-$4");
                System.out.println(number);

            } else System.out.println("No correct input number");
    }


}