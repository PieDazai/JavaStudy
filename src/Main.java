import OOP.*;
import Pc.Class.*;
import Pc.Enums.*;
import com.sun.source.tree.BreakTree;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Main {

    private static final String reg = "([А-яёЁ-]+\\s){2}([А-яёЁ-]+)";
    private  static final String FIND_REG_NUMBER = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";

    public static void main(String[] args) {
        /*NAME_REG();
        NumberReg();
        workOfComputer();
        workOfDate();
        workOfWine();
        workOfExtends();
        workOfInterface();

        Users user1 = new Users("Vanya", 23);
        Users user2 = new Users("Vanya", 23);
        System.out.println(user1.toString());
        System.out.println(user1.equals(user2));
        workOfLyambda();*/

        Map<String, Map<String, Integer>> maps = new TreeMap<>();
        Map<String, Integer> Kirill = new TreeMap<>();
        Kirill.put("Кирилл", 19);

        Map<String, Integer> Kirill1 = new TreeMap<>();
        Kirill.put("Кирилл", 193);

        Map<String, Integer> Nastya = new TreeMap<>();
        Nastya.put("Настя", 18);

        maps.put("Первое поле", Kirill);
        maps.put("Второе поле", Nastya);


       int max = maps.entrySet().stream().flatMap(x -> x.getValue().values().stream()).
               mapToInt(e -> e).max().getAsInt();

        System.out.println(max);


    }

    public static void printer(InterfaceTwo two){
        two.print(4);
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

    public static void workOfDate(){
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

    public static void workOfComputer(){
        Processor processor = new Processor(Gerc.THREE_GERC, CoreCount.EIGHT_COUNT, Maker.RUSSIA, 400);
        Corememory corememory = new Corememory(Typememory.DDR4, 30, 500);
        Harddisk harddisk = new Harddisk(TypeDisk.SSD, 1024, 300);
        Display display = new Display(50.5, 1200, Typedisplay.VA);
        Keyboard keyboard = new Keyboard(Typekeyboard.PROVOD, 600, IsPodsvetka.YES_SVET);

        Computer pc = new Computer(processor, corememory, harddisk, display, keyboard);
        pc.weightcount();
        System.out.println(pc);
    }

    public static void workOfWine(){
        Wine wine1 = new Wine("vodka", "5 ozer", "RUSSIA", "водка лучшая",
                LocalDate.of(2006, 1, 14));

        wine1.YearWine(LocalDate.now());
        System.out.println(wine1.getOpisanie());
    }

    public static void workOfExtends(){

        Animal dog = new Dog("Rex", 3.600, 2);
        Dog dog1 = new Dog("Ben", 5.600, 12);
        Animal duck = new Duck("Alice", 5.600, 12);
        Duck duck1 = new Duck("DuckDuck", 9.600, 32);
        dog.move();
        dog.walk();
        // dog.bark(); --- NO bark
        dog1.bark();

        duck.move();
        duck.walk();
        duck1.kryak();

    }

    public static void workOfInterface(){
        TurnController controller = new TurnController();
        Fen fen = new Fen();
        TV tv = new TV();
        Lamp lamp = new Lamp();
        controller.turnOnDevice(tv);
        controller.turnOffDevice(tv);
        controller.turnOnDevice(lamp);
    }

    public static  void workOfLyambda(){
        InterfaceTwo inTwo = (x) -> System.out.println("Print: " + x);
        inTwo.print(5);

        Predicate<Integer> pred = (x) -> x > 10;
        System.out.println(pred.test(45));

        BinaryOperator<Integer> binInt = (x, y) -> x * y;
        System.out.println(binInt.apply(10, 2));

        UnaryOperator<Integer> unInt = (x) -> x + x;
        System.out.println(unInt.apply(4));

        Function<String, Integer> parse = Integer::parseInt;
        System.out.println(parse.apply("123")+2);

        Consumer<Integer> consumer = (x) -> System.out.println(x * x + 3);
        consumer.accept(3);

        System.out.println("new лямбда");
        printer(x -> System.out.println(x * x + 3));

        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }

}