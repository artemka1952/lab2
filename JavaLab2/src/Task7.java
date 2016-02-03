
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author var1541b
 */
public class Task7 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите X и Y");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a_str = in.readLine(); //читаем строку с клавиатуры
        String b_str = in.readLine();

        int a = Integer.parseInt(a_str); //преобразовываем строку в число.
        int b = Integer.parseInt(b_str);

        if ((a > 0) && (b > 0)) {
            System.out.println("1 четверть");
        }
        if ((a < 0) && (b > 0)) {
            System.out.println("2 четверть");
        }
        if ((a < 0) && (b < 0)) {
            System.out.println("3 четверть");
        }
        if ((a > 0) && (b < 0)) {
            System.out.println("4 четверть");
        }
    }
}
