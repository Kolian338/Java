import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите целое число еще раз: ");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2;
        System.out.println("Максимальное число: " + max);
        int min = (number1 < number2) ? number1 : number2;
        System.out.println("Минимальное число: " + min);

        if (number1 < number2) {
            System.out.println("Максимальное число: " + number2);
            System.out.println("Минимальное число: " + number1);
        } else if (number1 > number2) {
            System.out.println("Максимальное число: " + number1);
            System.out.println("Минимальное число: " + number2);
        } else {
            System.out.println("Числа равны");
        }
    }
}
