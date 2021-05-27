import java.util.Scanner;

public class RangeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона: ");
        double from = scanner.nextDouble();

        System.out.print("Введите конец диапазона: ");
        double to = scanner.nextDouble();

        Range range = new Range(from, to);

        System.out.print("Введите любое число: ");
        double number = scanner.nextDouble();

        while (true) {
            if (range.isInside(number)) {
                System.out.print("Число находится в диапазоне, длинна диапазона = " + range.getLength());
                break;
            }

            if (number > to) {
                System.out.println("Начало диапазона = " + range.getTo());
                System.out.print("Число вне диапазона, измените конец диапазона: ");
                to = scanner.nextDouble();
                range.setTo(to);
            } else {
                System.out.println("Конец диапазона = " + range.getFrom());
                System.out.print("Число вне диапазона, измените начало диапазона: ");
                from = scanner.nextDouble();
                range.setFrom(from);
            }
        }
    }
}
