public class Palindrome {
    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        System.out.println("Палиндром = " + isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        string = string.toLowerCase();

        while (i < j) {
            char currentLeftSymbol = string.charAt(i);
            char currentRightSymbol = string.charAt(j);

            if (!Character.isLetter(currentLeftSymbol)) { // Если не буквы
                i++;
            } else if (!Character.isLetter(currentRightSymbol)) {
                j--;
            } else if (Character.isLetter(currentLeftSymbol) == Character.isLetter(currentRightSymbol)) { // Проверка равенства букв
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}

