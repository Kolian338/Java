public class MultiplicationTable {
    public static void main(String[] args) {
        int rowsCount = 5; // Строки
        int columnsCount = 15; // Столбцы

        System.out.print(" * |");

        for (int i = 1; i <= columnsCount; i++) { // Дублирующая строка
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.print("  —|");

        for (int i = 1; i <= columnsCount; i++) { // Разделительная строка
            System.out.print("————");
        }

        System.out.println();

        for (int i = 1; i <= rowsCount; i++) { // Строки
            System.out.printf("%3d|", i); // Дублирующий стобец

            for (int j = 1; j <= columnsCount; j++) { // Столбцы
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}

