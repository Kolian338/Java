public class MaximumSubstring {
    public static void main(String[] args) {
        System.out.println("Максимальная подстрока = " + getMaxSubstringLength("аааббдеггггв"));
    }

    private static int getMaxSubstringLength(String string) { // Получить максимальную длину подстроки
        if (string.length() == 0) {
            return 0;
        }

        string = string.toLowerCase();
        int currentSubstringLength = 1;
        int maxSubstringLength = 1;

        for (int i = 1; i < string.length(); i++) {
            char currentSymbol = string.charAt(i);
            char previousSymbol = string.charAt(i - 1);

            if (currentSymbol == previousSymbol) {
                currentSubstringLength++;
            } else {
                currentSubstringLength = 1;
            }

            if (currentSubstringLength > maxSubstringLength) {
                maxSubstringLength = currentSubstringLength;
            }
        }

        return maxSubstringLength;
    }
}