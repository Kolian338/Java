import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String userLine = scanner.nextLine();

        String password = "123456";
        int passwordLength = password.length();
        int userLineLength = userLine.length();

        if (password.equals(userLine)) {
            System.out.println("Верный пароль");
        } else if (userLineLength > passwordLength) {
            System.out.println("Пароль не верный и пароль длинный");
        } else if (userLineLength < passwordLength) {
            System.out.println("Пароль не верный и короткий");
        } else {
            System.out.println("Пароль не верный");
        }
    }
}
