import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurrencesCount {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "input.txt";
        String substring = "ab";

        System.out.println("Кол.во вхождений подстроки = " + getOccurrencesCount(fileName, substring));
    }

    private static int getOccurrencesCount(String fileName, String substring) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            int occurrencesCount = 0;
            substring = substring.toLowerCase(); //Подстрока в нижн.рег

            while (scanner.hasNextLine()) { //Пока есть строка
                int i = 0;
                String fileString = scanner.nextLine().toLowerCase(); //Перевод строки в ниж.рег

                while (i < fileString.length()) { // Пока есть символы в строке
                    int startIndex = fileString.indexOf(substring, i); // Получаем индекс вхождения подстроки с опр.места

                    if (startIndex > -1) { //Если есть такая подстрока
                        i = startIndex + substring.length(); // След.индекс после вхождения
                        occurrencesCount++;
                    } else {
                        break;
                    }
                }
            }

            return occurrencesCount;
        }
    }
}