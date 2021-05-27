public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Среднее арифметическое четных чисел: " + getEvenNumbersAverage(array));
    }

    private static double getEvenNumbersAverage(int[] array) {
        int evenNumbersCount = 0; // Количество четных чисел
        int evenNumbersSum = 0; //Сумма для четных чисел

        for (int element : array) {
            if (element % 2 == 0) {
                evenNumbersSum += element;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }
}
