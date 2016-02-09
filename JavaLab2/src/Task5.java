
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* var1541b
 * Написать функцию, которая вычисляет минимум из четырёх чисел. 
 */
public class Task5 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите 4 числа");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        try {
            String a_str = in.readLine(); //читаем строку с клавиатуры
            a = Integer.parseInt(a_str); //преобразовываем строку в число.
        } catch (Exception ex) {
            System.out.println("Ошибка ввода 1 числа");
        }

        try {
            String b_str = in.readLine(); //читаем строку с клавиатуры
            b = Integer.parseInt(b_str); //преобразовываем строку в число.
        } catch (Exception ex) {
            System.out.println("Ошибка ввода 2 числа");
        }

        try {
            String c_str = in.readLine(); //читаем строку с клавиатуры
            c = Integer.parseInt(c_str); //преобразовываем строку в число.
        } catch (Exception ex) {
            System.out.println("Ошибка ввода 3 числа");
        }

        try {
            String d_str = in.readLine(); //читаем строку с клавиатуры
            d = Integer.parseInt(d_str); //преобразовываем строку в число.
        } catch (Exception ex) {
            System.out.println("Ошибка ввода 4 числа");
        }
        int x = srav(a, b);
        int y = srav(c, d);
        if (x > y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }

    public static int srav(int c, int d) {

        if (c > d) {
            return (d);
        } else if (c < d) {
            return (c);
        } else {
            return (c);
        }
    }
}
