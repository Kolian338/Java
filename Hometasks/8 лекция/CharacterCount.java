import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String s = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int whitespacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i))) {
                lettersCount++;
            } else if (Character.isDigit(s.charAt(i))) {
                digitsCount++;
            } else if (Character.isWhitespace(s.charAt(i))) {
                whitespacesCount++;
            } else {
                otherSymbolsCount++;
            }
        }

        System.out.println("Число букв в строке: " + lettersCount);
        System.out.println("Число цифр в строке: " + digitsCount);
        System.out.println("Число пробелов в строке: " + whitespacesCount);
        System.out.println("Число остальных символов в строке: " + otherSymbolsCount);
    }
}
