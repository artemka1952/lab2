/* var1541b
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок
 */
import java.io.*;

public class Task2 {

    public static void main(String[] args) {
         int m = 0, n = 0;
         System.out.println("Введите 2 числа");
       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String m_str = null;
        try {
            m_str = in.readLine();//читаем строку с клавиатуры
            m = Integer.parseInt(m_str);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }
        String n_str = null;
        try {
            n_str = in.readLine();
            n = Integer.parseInt(n_str);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(8 + " ");
            }
            System.out.println();
        }

    }
}
