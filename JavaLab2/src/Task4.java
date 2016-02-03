
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * var1541b
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из них
 */
/*
 *
 * @author var1541b
 */
public class Task4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите 2 числа");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String m_str = in.readLine(); //читаем строку с клавиатуры
        String n_str = in.readLine(); //читаем строку с клавиатуры

        int m = Integer.parseInt(m_str); //преобразовываем строку в число.
        int n = Integer.parseInt(n_str); //преобразовываем строку в число.

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
