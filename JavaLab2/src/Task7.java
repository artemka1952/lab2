
import java.io.BufferedReader;
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

    public static void main(String[] args) throws Exception {
        System.out.println("Введите X и Y");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        try {
            String a_str = in.readLine(); //читаем строку с клавиатуры
            a = Integer.parseInt(a_str); //преобразовываем строку в число.
        } catch (Exception e) {
            System.out.println("Ошибка ввода 1 числа");
        }

        try {
            String b_str = in.readLine(); //читаем строку с клавиатуры
            b = Integer.parseInt(b_str); //преобразовываем строку в число.
        } catch (Exception e) {
            System.out.println("Ошибка ввода 2 числа");

            if ((a > 0) && (b > 0)) {
                System.out.println("1 четверть");
            } else if ((a < 0) && (b > 0)) {
                System.out.println("2 четверть");
            } else if ((a < 0) && (b < 0)) {
                System.out.println("3 четверть");
            } else if ((a > 0) && (b < 0)) {
                System.out.println("4 четверть");
            } else {
                System.out.println("Точка лежит на пересечении четвертей");
            }ЫЫ
        }
    }
}
