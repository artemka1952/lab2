
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
        String a_str = in.readLine(); //читаем строку с клавиатуры
        String b_str = in.readLine();
        String c_str = in.readLine();
        String d_str = in.readLine();//читаем строку с клавиатуры

        int a = Integer.parseInt(a_str); //преобразовываем строку в число.
        int b = Integer.parseInt(b_str);
        int c = Integer.parseInt(c_str);
        int d = Integer.parseInt(d_str);
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
