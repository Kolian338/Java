import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0; // Сумма всех чисел
        int oddSum = 0; // Сумма нечетных чисел
        int maxDigit = 0; // Максимальное число

        while (number != 0) {
            int currentDigit = number % 10; // Для хранения текущего числа

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }

            if (currentDigit % 2 != 0) {
                oddSum += currentDigit;
            }

            sum += currentDigit;
            number /= 10;
        }

        System.out.println("Сумма всех цифр: " + sum);
        System.out.println("Сумма нечетных цифр: " + oddSum);
        System.out.println("Максимальная цифра: " + maxDigit);
    }
}
