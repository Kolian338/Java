public class Circle {
    public static void main(String[] args) {
        /**
         * Это документирующий комментарий.
         * Для выполнения различных математических операций в Java в пакете java.lang определен класс Math.
         * Math.Round - Округляет значение до ближайшего целого или указанного количества десятичных знаков.
         *  */

        //TODO: реализовать ввод
        int radius = 3;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга с радиусом " + radius + " равна: " + circleArea);

        double circumference = 2 * Math.PI * radius;
        System.out.println("Длина окружности с радиусом " + radius + " равна: " + circumference);

        double circleRadius = Math.sqrt(circleArea / Math.PI);
        System.out.println("Радиус окружности с площадью " + circleArea + " равен: " + circleRadius);

        int angle = 13;
        double sectorArea = (Math.PI * Math.pow(radius, 2) / 360) * angle;
        System.out.println("Площадь сектора с радиусом " + radius + " и углом " + angle + " градусов " + "равна: " + sectorArea);
    }
}
