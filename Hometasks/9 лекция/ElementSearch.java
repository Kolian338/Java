public class ElementSearch {
    public static void main(String[] args) {
        int[] array = new int[]{-100, 81, 3, 4, 5, -1, 70, 8, 9, 90};

        int number = 3; // Число которое ищем
        System.out.print("Индекс: " + getElementIndex(array, number));
    }

    private static int getElementIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }
}
