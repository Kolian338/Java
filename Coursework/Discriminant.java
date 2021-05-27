import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (a == 0 || (b == 0 && c == 0)) {
            System.out.println("Корней нет");
            return;
        } else if (b == 0 && c != 0) {
            d = -4 * a * c;
        } else if (c == 0 && b != 0) {
            d = b * b;
        }

        if (d == 0) {
            double x = (-b / (2 * a));
            System.out.println("x = " + x);
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Корней нет");
        }
    }
}
