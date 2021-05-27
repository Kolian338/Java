import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 6, 10, 4, 0};

        sortInsertion(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortInsertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i]; // Элемент неотсортированной части

            for (int j = i - 1; j >= -1; j--) { // Ищем в отсортированной части место для элемента
                if (j >= 0 && temp < array[j]) {// Счетчик находится в отсортированной части? и элемент который хотим вставить меньше чем число по индексу j?
                    array[j + 1] = array[j]; // Двигаем
                } else {
                    array[j + 1] = temp; // Вставляем элемент так как он больше чем число по индексу j
                    break;
                }
            }
        }
    }
}
