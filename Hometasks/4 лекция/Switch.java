import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите команду: ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                System.out.println("Результат сложения: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Результат вычитания: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Результат умножения: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Результат деления: " + ((double) number1 / number2));
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
