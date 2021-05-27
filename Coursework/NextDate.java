import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий день: ");
        int currentDay = scanner.nextInt();

        System.out.print("Введите текущий месяц: ");
        int currentMonth = scanner.nextInt();

        System.out.print("Введите текущий год: ");
        int currentYear = scanner.nextInt();

        int daysInCurrentMonth = 31; // количество дней в текущем месяце
        final int monthsInYearCount = 12; // количество месяцев в году

        if ((currentDay > daysInCurrentMonth || currentDay <= 0) || (currentMonth > monthsInYearCount || currentMonth <= 0) || currentYear <= 0) { // Проверка на корректность дд.мм.гггг
            System.out.println("Некорректная дата");
        } else {
            switch (currentMonth) { // присваиваем максимум дней в текущем месяце
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInCurrentMonth = 30;
                    break;
                case 2: // февраль в високосном году или нет
                    if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) { // Високосный год
                        daysInCurrentMonth = 29;
                    } else {
                        daysInCurrentMonth = 28;
                    }
                    break;
                default:
                    daysInCurrentMonth = 31;
                    break;
            }

            if (currentDay == daysInCurrentMonth && currentMonth == monthsInYearCount) { // сбрасывается д.м и увеличивается год
                currentDay = 1;
                currentMonth = 1;
                currentYear++;
            } else if (currentDay == daysInCurrentMonth) { // сбрасывается день и увеличивается месяц
                currentDay = 1;
                currentMonth++;
            } else if (currentDay < daysInCurrentMonth) { // получаем след день
                currentDay++;
            } else {
                System.out.println("Нет такого дня в текущем месяце");
                return;
            }

            System.out.printf("%02d.%02d.%d", currentDay, currentMonth, currentYear);
        }
    }
}
