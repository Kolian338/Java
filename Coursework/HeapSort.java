import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 6, 2, 10, 4, 7, 8, 9};

        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array) {
        int arraySize = array.length; // Размер массива

        for (int i = arraySize / 2 - 1; i >= 0; i--) { // Делаем просеивание элементов
            heapBuild(array, i, arraySize);
        }

        for (int i = arraySize - 1; i > 0; i--) { // Сортируем дерево
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapBuild(array, 0, i);
        }
    }

    private static void heapBuild(int[] array, int currentIndex, int currentArraySize) {
        while (currentIndex <= currentArraySize / 2 - 1) { // Пока у элемента есть дети в куче
            int leftIndex = 2 * currentIndex + 1;
            int rightIndex = 2 * currentIndex + 2;
            int maxIndex = leftIndex;

            if (rightIndex <= currentArraySize - 1 && array[rightIndex] > array[leftIndex]) { // Максимум
                maxIndex = rightIndex;
            }

            if (array[maxIndex] > array[currentIndex]) { //Если максимальный ребенок больше родителя
                int temp = array[maxIndex];
                array[maxIndex] = array[currentIndex];
                array[currentIndex] = temp;
                currentIndex = maxIndex;
            } else { //Если максимальный ребенок меньше родителя
                currentIndex = currentArraySize;
            }
        }
    }
}
