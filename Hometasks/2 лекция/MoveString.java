public class MoveString {
    public static void main(String[] args) {
        System.out.println("Строка1" + System.lineSeparator() + "Строка2"); // Перевод нескольких строк
        System.out.println("\"30\" августа 2014г." + System.lineSeparator() + "C:\\Windows\\System32\\Drivers\\etc\\hosts"); // Экранирование

        int x = 5; // 1. Переменные определены с новой строки
        int y = 5;
        int z = x + y;

        System.out.println("Результат = " + z); // Преобразование в строку
    }
}
