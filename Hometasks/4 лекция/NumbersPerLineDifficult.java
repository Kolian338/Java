import java.util.Scanner;

public class NumbersPerLineDifficult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввведите начальное число: ");
        int initialNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int finiteNumber = scanner.nextInt();

        System.out.print("Количество чисел в строке: ");
        int numbersAmountPerLine = scanner.nextInt();

        int count = 0;
        int i = initialNumber; // Счетчик цикла

        while (i <= finiteNumber) {
            if (count == numbersAmountPerLine) {
                System.out.println();
                count = 0;
            }

            System.out.printf("%4d ", i);
            count++;
            i++;
        }
    }
}
