public class SortingCheck {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 10};
        System.out.println(isSortedAscending(array));
        System.out.println(isSortedDescending(array));
    }

    private static boolean isSortedAscending(int[] array) { //По возрастанию
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSortedDescending(int[] array) { // По убыванию
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
