public class Overload {
    public static void main(String[] args) {
        int byteSize = getTypeSize((byte) 1);
        System.out.println("Требуется " + byteSize + " байт");

        int shortSize = getTypeSize((short) 1);
        System.out.println("Требуется " + shortSize + " байта");

        int intSize = getTypeSize(1);
        System.out.println("Требуется " + intSize + " байта");

        int longSize = getTypeSize((long) 1);
        System.out.println("Требуется " + longSize + " байтов");

        int floatSize = getTypeSize((float) 1);
        System.out.println("Требуется " + floatSize + " байта");

        int doubleSize = getTypeSize((double) 1);
        System.out.println("Требуется " + doubleSize + " байтов");
    }

    private static int getTypeSize(byte number) {
        return 1;
    }

    private static int getTypeSize(short number) {
        return 2;
    }

    private static int getTypeSize(int number) {
        return 4;
    }

    private static int getTypeSize(long number) {
        return 8;
    }

    private static int getTypeSize(float number) {
        return 4;
    }

    private static int getTypeSize(double number) {
        return 8;
    }
}

