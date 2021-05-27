import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int ageLastDigit = age % 10;
        int maxAge = 350;
        boolean excludedNumbers = (age % 100 >= 11) && (age % 100 <= 14);

        if (age <= 0) {
            System.out.println("Вы слишком малы");
        } else if (age > maxAge) {
            System.out.println("Вы слишком стары");
        } else if (ageLastDigit == 1 && !excludedNumbers) {
            System.out.println("Вам " + age + " год");
        } else if (ageLastDigit >= 2 && ageLastDigit <= 4 && !excludedNumbers) {
            System.out.println("Вам " + age + " года");
        } else {
            System.out.println("Вам " + age + " лет");
        }
    }
}
