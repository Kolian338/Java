import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во этажей: ");
        int floorsCount = scanner.nextInt();

        System.out.print("Введите кол-во подьездов: ");
        int porchesCount = scanner.nextInt();

        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = scanner.nextInt();

        final int apartmentsPerFloorCount = 4; // Количество квартир на одном этаже
        int blocksCount = floorsCount * porchesCount; // Общ кол-во блоков квартир
        int houseApartmentsCount = blocksCount * apartmentsPerFloorCount; // Общ кол-во квартир в доме

        if (apartmentNumber > houseApartmentsCount || apartmentNumber <= 0) {
            System.out.print("Такой квартиры нет");
        } else {
            int apartmentBlockNumber = (int) Math.ceil((double) apartmentNumber / apartmentsPerFloorCount); // Номер блока квартиры
            int porchNumber = (int) Math.ceil((double) apartmentBlockNumber * porchesCount / blocksCount); // Номер подьезда квартиры
            int floorNumber = apartmentBlockNumber - (porchNumber - 1) * floorsCount; // Номер этажа квартиры
            int apartmentLocation = apartmentNumber % apartmentsPerFloorCount; // Положение квартиры

            System.out.println("Номер подьезда: " + porchNumber);
            System.out.println("Номер этажа: " + floorNumber);

            if (apartmentLocation == 0) {
                System.out.println("Квартира " + apartmentNumber + " ближняя справа");
            } else if (apartmentLocation == 1) {
                System.out.println("Квартира " + apartmentNumber + " ближняя слева");
            } else if (apartmentLocation == 2) {
                System.out.println("Квартира " + apartmentNumber + " дальняя слева");
            } else {
                System.out.println("Квартира " + apartmentNumber + " дальняя справа");
            }
        }
    }
}
