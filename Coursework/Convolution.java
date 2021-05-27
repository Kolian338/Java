import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class Convolution {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster raster = image.getRaster();
        // получаем ширину и высоту картинки
        int width = raster.getWidth(); // Ширина 1024
        int height = raster.getHeight(); // Высота 768

        final int rgbColorsCount = 3;
        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[rgbColorsCount];
        int[] pixelResult = new int[rgbColorsCount];
        double[][] matrix = new double[][]{{0.111, 0.111, 0.111}, {0.111, 0.111, 0.111}, {0.111, 0.111, 0.111}};

        for (int y = 1; y < height - 1; ++y) { // цикл по строкам картинки
            for (int x = 1; x < width - 1; ++x) { // цикл по пикселям строки
                for (int k = 0; k < rgbColorsCount; ++k) { // цикл по компонентам пикселя
                    int componentsResult = 0;

                    for (int i = y - 1, h = 0; i <= y + 1; ++i, h++) { // строки соседей h - height
                        for (int j = x - 1, w = 0; j <= x + 1; ++j, w++) { // столбцы соседей w - width
                            raster.getPixel(j, i, pixel); // получаем текущий пиксель с координатами (j, i) - его цвета кладутся в массив pixel

                            componentsResult = (int) (matrix[h][w] * pixel[k]) + componentsResult; // складываем все компоненты по области
                        }
                    }

                    pixelResult[k] = componentsResult; // записываем новый цвет компоненты для результирующей картинки
                }
                // записываем значения цветов для пикселя в результирующую картинку
                raster.setPixel(x, y, pixelResult);
            }
        }
        // сохраняем картинку в файл
        ImageIO.write(image, "png", new File("outResult.png"));
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
