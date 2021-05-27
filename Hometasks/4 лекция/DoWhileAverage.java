public class DoWhileAverage {
    public static void main(String[] args) {
        int rangeEnd = 17; // Конец диапозона
        int i = 3; //Счетчик
        int evenNumbersCount = 0; // Количество четных чисел
        int evenNumbersSum = 0; // Сумма для четных чисел
        int numbersCount = 0; // Количество всех чисел
        int numbersSum = 0; // Сумма для всех чисел

        do {
            numbersCount++;
            numbersSum += i;

            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            i++;
        } while (i <= rangeEnd);

        double average = (double) numbersSum / numbersCount;
        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.println("Среднее арифметическое чисел: " + average);
        System.out.println("Среднее арифметическое четных чисел: " + evenNumbersAverage);
    }
}
