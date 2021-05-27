import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты точки x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координаты точки y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты точки x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координаты точки y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты точки x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координаты точки y3: ");
        double y3 = scanner.nextDouble();

        if ((x3 - x1) * (y2 - y1) == (x2 - x1) * (y3 - y1)) {
            System.out.println("Точки лежат на одной прямой!");
        } else {
            double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
            double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

            double triangleHalfPerimeter = (a + b + c) / 2;
            double triangleArea = Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - a) * (triangleHalfPerimeter - b) * (triangleHalfPerimeter - c));

            System.out.println("Площадь треугольника равна: " + triangleArea);
        }
    }
}
