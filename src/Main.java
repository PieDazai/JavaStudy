import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        boolean itog = true;

        if (num <= 1) itog = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    itog = false;
                    break;
                }
            }
        }
        if (itog) System.out.println(num + " - простое число.");
        else System.out.println(num + " - не простое число.");
    }
}