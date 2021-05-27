import java.util.Scanner;

public class PrintAndRead {
    public static int printAndRead(String line) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(line);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int a = printAndRead("Введите число: ");
        System.out.println("Вы ввели: " + a);

        int b = printAndRead("Введите число еще раз: ");
        System.out.println("Вы ввели: " + b);
    }
}
