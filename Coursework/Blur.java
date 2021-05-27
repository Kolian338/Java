import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class Blur {
    public static void main(String[] args) throws IOException {
        // читаем картинку из файла image.jpg в объект класса BufferedImage
        BufferedImage sourceImage = ImageIO.read(new File("image.jpg"));
        BufferedImage resultImage = ImageIO.read(new File("image.jpg"));

        // получаем растр - объект, внутри которого содержится двумерный массив пикселей
        WritableRaster sourceRaster = sourceImage.getRaster();
        WritableRaster resultRaster = resultImage.getRaster();

        // получаем ширину и высоту картинки 1024x768
        int width = sourceRaster.getWidth();
        int height = sourceRaster.getHeight();

        final int rgbColorsCount = 3;
        // создаем массив, в котором будет содержаться текущий пиксель
        // это массив из 3 элементов, в нем по очереди лежат числа R, G, B
        // т.е. по индексу 0 будет лежать красная компонента, по индексу 1 - зеленая, по индексу 2 - синяя
        int[] pixel = new int[rgbColorsCount];

        // создаем матрицу элементов
        double matrixElement = 1.0 / 9;
        double[][] matrix = new double[][]{
                {matrixElement, matrixElement, matrixElement},
                {matrixElement, matrixElement, matrixElement},
                {matrixElement, matrixElement, matrixElement}
        };

        // задаем границы для обрабатываемой области картинки
        int pictureBorderWidth = width - matrix.length / 2;
        int pictureBorderHeight = height - matrix.length / 2;

        // цикл по строкам картинки
        for (int y = matrix.length / 2; y < pictureBorderHeight; y++) {
            // цикл по пикселям
            for (int x = matrix.length / 2; x < pictureBorderWidth; x++) {
                // результирующий цвет для компонент R, G, B
                double resultColorR = 0;
                double resultColorG = 0;
                double resultColorB = 0;

                // цикл по строкам матрицы
                for (int i = y - matrix.length / 2, h = 0; h < matrix.length; i++, h++) {
                    // цикл по элементам
                    for (int j = x - matrix.length / 2, w = 0; w < matrix.length; j++, w++) {
                        // получаем текущий пиксель с координатами (j, i) - его цвета кладутся в массив pixel
                        sourceRaster.getPixel(j, i, pixel);

                        // задаем результирующий цвет для компонент R, G, B
                        resultColorR += matrix[h][w] * pixel[0];
                        resultColorG += matrix[h][w] * pixel[1];
                        resultColorB += matrix[h][w] * pixel[2];
                    }
                }

                // формируем цвет пикселя
                pixel[0] = getRangeProcessing(resultColorR);
                pixel[1] = getRangeProcessing(resultColorG);
                pixel[2] = getRangeProcessing(resultColorB);

                // записываем значения цветов для пикселя в результирующую картинку
                resultRaster.setPixel(x, y, pixel);
            }
        }

        // сохраняем новую картинку в файл
        ImageIO.write(resultImage, "png", new File("resultImage.png"));
    }

    private static int getRangeProcessing(double componentColor) { // Обрезание по диапазону
        if (componentColor < 0) {
            return 0;
        } else if (componentColor > 255) {
            return 255;
        }

        return (int) Math.round(componentColor);
    }
}