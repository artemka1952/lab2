
import java.io.*;

/**
 * var1541b Сравнение имен
 */
public class Task6 {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String n1 = "", n2 = "";

        try {
            n1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println("Ошибка");

        }
        try {
            n2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

        if ((!n1.matches("^\\D*$")) || (!n2.matches("^\\D*$"))) {
            System.out.println("В имени есть числа");
        } else {
            if (n1.equalsIgnoreCase(n2)) {
                System.out.println("Имена идентичны");
            } else {
                if (n1.length() == n2.length()) {
                    System.out.println("Длины имен равны");
                } else {
                    if (n1.length() != n2.length()) {
                        System.out.println("Имена разные");
                        System.out.println("Длина имен разная");
                    }
                }
            }
        }
    }
}
