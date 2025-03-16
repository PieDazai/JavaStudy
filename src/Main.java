import Pc.Class.*;
import Pc.Enums.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static String booksInfo = "";
    public static void main(String[] args) {

   // ArithmeticCalculator calk = new ArithmeticCalculator(20, 3);
   // calk.calculate(Operations.MULTIPLY);
        Processor processor = new Processor(Gerc.THREE_GERC, CoreCount.EIGHT_COUNT, Maker.RUSSIA, 400);
        Corememory corememory = new Corememory(Typememory.DDR4, 30, 500);
        Harddisk harddisk = new Harddisk(TypeDisk.SSD, 1024, 300);
        Display display = new Display(50.5, 1200, Typedisplay.VA);
        Keyboard keyboard = new Keyboard(Typekeyboard.PROVOD, 600, IsPodsvetka.YES_SVET);


        Computer pc = new Computer(processor, corememory, harddisk, display, keyboard);
        pc.weightcount();
        System.out.println(pc);

    }
}