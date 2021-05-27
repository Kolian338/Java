import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fixedString = "12345";

        for (; ; ) {
            System.out.print("Введите загаданную строку: ");
            String userLine = scanner.nextLine();

            if (fixedString.equals(userLine)) {
                System.out.print("Вы угадали строку");
                break;
            }
        }
    }
}

