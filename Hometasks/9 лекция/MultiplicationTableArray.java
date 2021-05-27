public class MultiplicationTableArray {
    public static void main(String[] args) {
        int rowsCount = 5;
        int columnsCount = 10;

        int[][] array = getMultiplicationTable(rowsCount, columnsCount);

        for (int i = 0; i < array.length; i++) { // Вывод
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }

            System.out.println();
        }
    }

    private static int[][] getMultiplicationTable(int rowsCount, int columnsCount) { //Кладем значения по индексам
        int[][] array = new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }
}
