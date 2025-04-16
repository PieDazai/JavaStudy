package AnotherMain;

import java.util.Scanner;

public class ExceptionsWork {

    public static void main(String[] args) {


        while (true) {
            try {
                System.out.println("Input number: ");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int res = a / b;
                System.out.println("Answer: " + res);
            }
            catch (Exception e){
                System.out.println("нельзя делть на 0!");
            }
        }
    }

    public static void math() throws Exception {

        while (true) {

                System.out.println("Input number: ");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(b == 0)
                    throw  new Exception("нельзя делть на 0!");
                int res = a / b;
                System.out.println("Answer: " + res);
        }
    }
}
