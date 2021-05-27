import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 2; i <= number; i++) { // Провяряем все значения
            boolean isSimple = true; // Изначально простое

            for (int j = 2; j < i; j++) { // Проверяет делится ли на предыдущие числа
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }

            if (isSimple) {
                System.out.println("Это число простое " + i);
            }
        }
    }
}
