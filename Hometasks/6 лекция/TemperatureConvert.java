import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру Цельсия: ");
        double celsius = scanner.nextDouble();

        System.out.println("Температура Фаренгейта = " + convertToFahrenheit(celsius));
        System.out.println("Температура Кельвина = " + convertToKelvin(celsius));
    }

    private static double convertToFahrenheit(double celsius) {
        return celsius * (double) 9 / 5 + 32;
    }

    private static double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
