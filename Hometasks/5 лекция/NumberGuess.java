import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        final int startNumber = 1;
        final int endNumber = 100;
        final int randomNumber = startNumber + random.nextInt(endNumber - startNumber + 1);

        for (int i = 1; ; i++) {
            System.out.print("Введите загаданное число: ");
            int number = scanner.nextInt();

            if (randomNumber < number) {
                System.out.println("Загаданное число меньше");
            } else if (randomNumber > number) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы угадали за " + i + " попытки");
                break;
            }
        }
    }
}

