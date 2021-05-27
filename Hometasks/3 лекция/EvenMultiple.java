import java.util.Scanner;

public class EvenMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }

        if (number % 5 != 0) {
            System.out.println("Число не кратное 5");
        } else {
            System.out.println("Число кратное 5");
        }
    }
}
