public class RowSum {
    public static void main(String[] args) {
        int numbersCount = 6; // Количество чисел в выражении
        int i = 1;
        int sum = 0;

        while (i <= numbersCount) {
            double currentNumber = (Math.pow(-1, i + 1) * Math.pow(i, 2));
            sum += currentNumber;
            i++;
        }
        System.out.print("Результат выражения: " + sum);
    }
}
