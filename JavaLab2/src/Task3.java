/*
 * var1541b
 * Используя цикл for вывести на экран прямоугольный
 * треугольник из восьмёрок со сторонами 10 и 10
 */

/**
 *
 * @author var1541b
 */
public class Task3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(8 + " ");
                if (j == i) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
