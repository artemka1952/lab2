
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * var1541b
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из них
 */
public class Task4 {

    public static void main(String[] args) throws IOException {
        int m = 0;
        int n = 0;
        System.out.println("Введите 2 числа");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            String m_str = in.readLine(); //читаем строку с клавиатуры}
            m = Integer.parseInt(m_str); //преобразовываем строку в число.
        } catch (Exception ex) {
            System.out.println("Ошибка ввода 1 числа");
           
        }
        try {
            String n_str = in.readLine(); //читаем строку с клавиатуры
            n = Integer.parseInt(n_str); //преобразовываем строку в число.
        } catch (Exception ex) {
            System.out.println("Ошибка ввода 2 числа");
        }
        sravnenie(m, n);

    }

    public static void sravnenie(int m, int n) {

        if (m > n) {
            System.out.println(n);
        } else if (m < n) {
            System.out.println(m);
        } else {
            System.out.println("Оба числа равны");
        }

    }
}
