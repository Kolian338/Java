import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        double initialDepositAmount = scanner.nextDouble();

        System.out.print("Введите процентную ставку: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите срок вклада в месяцах: ");
        int depositTerm = scanner.nextInt();

        final int maxPercentage = 100;
        final int monthsInYearCount = 12;

        double finalDepositAmount = initialDepositAmount; // Конечная сумма вклада
        double interestRatePerMonth = (interestRate / maxPercentage) / monthsInYearCount; // Процентная ставка за месяц

        for (int i = 1; i <= depositTerm; i++) {
            double currentInterestAccrued = finalDepositAmount * interestRatePerMonth; // Текущая сумма начисленных процентов
            finalDepositAmount += currentInterestAccrued; // Сумма вклада на конец месяца
        }

        double profit = finalDepositAmount - initialDepositAmount;

        System.out.println("Выгода: " + profit);
        System.out.println("Сумма вклада с начисленными процентами: " + finalDepositAmount);
    }
}
