import java.util.Scanner;

public class PositiveNegativeChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число - положительное");
        } else if (number == 0) {
            System.out.println("Данное число - равно нулю");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
