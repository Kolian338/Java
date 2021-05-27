import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class BlackAndWhiteRendering {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();

        // получаем ширину и высоту картинки
        int width = raster.getWidth(); // Ширина
        int height = raster.getHeight(); // Высота

        final int rgbColorsCount = 3;

        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[rgbColorsCount];

        // цикл по строкам картинки
        for (int y = 0; y < height; ++y) {
            // цикл по пикселям строки
            for (int x = 0; x < width; ++x) {
                // получаем текущий пиксель с координатами (x, y) - его цвета кладутся в массив pixel
                raster.getPixel(x, y, pixel);

                double result = 0.3 * pixel[0] + 0.59 * pixel[1] + 0.11 * pixel[2];

                for (int k = 0; k < rgbColorsCount; ++k) {
                    pixel[k] = (int) result;
                }
                // записываем значения цветов для пикселя в картинку
                raster.setPixel(x, y, pixel);
            }
        }

        // сохраняем картинку в файл
        ImageIO.write(image, "png", new File("out.png"));
    }
}
