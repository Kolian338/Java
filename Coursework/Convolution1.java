import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class Convolution {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
        BufferedImage imageSource = ImageIO.read(new File("image.jpg"));
        BufferedImage imageResult = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster rasterSource = imageResult.getRaster();
        WritableRaster rasterResult = imageResult.getRaster();

        // получаем ширину и высоту картинки
        int width = rasterSource.getWidth(); // Ширина 1024
        int height = rasterSource.getHeight(); // Высота 768

        final int rgbColorsCount = 3;

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[rgbColorsCount];
        int[] pixelResult = new int[rgbColorsCount];

        // цикл по строкам картинки
        for (int y = 1; y < height - 1; ++y) {
            // цикл по пикселям строки
            for (int x = 1; x < width - 1; ++x) {
                // получаем текущий пиксель с координатами (x, y) - его цвета кладутся в массив pixel
                rasterSource.getPixel(x, y, pixelResult);

                // Цикл по области
                for (int k = 0; k < rgbColorsCount; ++k) { // Цикл по компонентам пикселя
                    int componentsResult = 0;

                    for (int i = y - 1; i <= y + 1; ++i) { // Строки соседей
                        for (int j = x - 1; j <= x + 1; ++j) { // Столбцы соседей
                            rasterSource.getPixel(j, i, pixel); // получаем текущий пиксель с координатами (j, i) - его цвета кладутся в массив pixel

                            componentsResult = (int) (0.111 * pixel[k]) + componentsResult; // Складываем все компоненты по области
                        }
                    }

                    // получаем текущий пиксель с координатами (x, y) - его цвета кладутся в массив pixel
                    //TODO Измененные компоненты не сохраняются в массиве, при вызове пиксяли старые компоненты заменяются на значения новых
                    //rasterSource.getPixel(x, y, pixelResult);
                    pixelResult[k] = componentsResult;
                }
                // записываем значения цветов для пикселя в картинку
                rasterResult.setPixel(x, y, pixelResult);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(imageSource, "png", new File("outSource.png"));
        ImageIO.write(imageResult, "png", new File("outResult.png"));
    }

    private static int rangeProcessing(int k) { // Обрезание по диапазону
        if (k < 0) {
            return 0;
        } else if (k > 255) {
            return 255;
        }

        return k;
    }
}
