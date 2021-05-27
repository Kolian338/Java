import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 10, 6, 4, 7, 8, 0};
        final int left = 0;
        final int right = array.length - 1;

        quickSort(array, left, right);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
        if (right - left < 1) { // Если один элемент или ноль
            return;
        }

        if (left + 1 == right) { // Если два элемент то выходим
            if (array[left] > array[right]) {// Если не в правильном порядке то меняем и выходим
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }

            return;
        }

        int x = array[left];
        int i = left;
        int j = right;

        while (i <= j) { // Пока счетчики не зашли друг за друга, если зашли то массив делим на две части
            while (array[i] < x) { // Ищем элемент который надо перекинуть в правую часть
                i++;
            }

            while (array[j] > x) { // Который надо перекинуть в левую часть
                j--;
            }

            if (i <= j) { // Обмен
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (j > left) { //рекурсивно сортируем левую часть от left до j
            quickSort(array, left, j);
        }

        if (i < right) { //рекурсивно сортируем правую часть от i до right
            quickSort(array, i, right);
        }
    }
}
