import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создали обьект класса

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double rectangleArea = (length * width); // Считаем площадь
        double rectanglePerimeter = 2 * (length + width); // Считаем периметр
        System.out.printf("Длина = %.2f%nШирина = %.2f%nПлощадь = %.2f%nПериметр = %.2f", length, width, rectangleArea, rectanglePerimeter); // Доработка задачи с printf
    }
}
