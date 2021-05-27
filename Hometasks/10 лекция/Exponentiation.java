public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(powerNoRecursion(2, 3));
    }

    private static int power(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return power(number, power - 1) * number;
    }

    private static int powerNoRecursion(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; ++i) {
            result *= number;
        }

        return result;
    }

}
