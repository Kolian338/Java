public class CircleArea {
    public static void main(String[] args) {
        int radius = 3;
        long area = Math.round(Math.PI * Math.pow(radius, 2));

        System.out.println("Площадь круга с радиусом " + radius + " равна: " + area);
    }
}
