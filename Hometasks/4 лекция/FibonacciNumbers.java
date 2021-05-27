import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int previousFibonacciNumber = 1; // предыдущие число
        int currentFibonacciNumber = 0; // текущие число фибоначчи

        if (n == previousFibonacciNumber) {
            currentFibonacciNumber = previousFibonacciNumber;
        } else {
            int i = 2; // счетчик
            int previousPreviousFibonacciNumber = 0; // пред предыдущие число

            while (i <= n) {
                currentFibonacciNumber = previousFibonacciNumber + previousPreviousFibonacciNumber;
                previousPreviousFibonacciNumber = previousFibonacciNumber;
                previousFibonacciNumber = currentFibonacciNumber;
                i++;
            }
        }

        System.out.println("Число Фибоначчи = " + currentFibonacciNumber);
    }
}
