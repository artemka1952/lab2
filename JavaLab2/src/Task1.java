/*
 * var1541b
 * Вывести на экран чётные числа от 1 до 100
 */

/**
 *
 * @author var1541b
 */
public class Task1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
