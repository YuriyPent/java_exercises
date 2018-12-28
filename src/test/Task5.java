/*
Расчет расстояния до места удара молнии. Звук в воздухе распространяется со 
скоростью приблизительно равной 1100 футам в секунду. Зная интервал времени 
между вспышкой молнии и звуком сопровождающим ее можно рассчитать расстояние. 
Допустим интервал 7,2 секунды.
 */
package test;

import java.util.Scanner;

public class Task5 {

    double s;
    double t;
    double f = 0.3048;

    void distance() {
        
        System.out.println("Введите скорость в фут/сек");
        Scanner scan = new Scanner(System.in);
        double sc = scan.nextDouble();
        System.out.println("Cкорость в равна: " + sc + " фут/сек");
        System.out.println("Введите время в сек");
        Scanner scan2 = new Scanner(System.in);
        double tc = scan2.nextDouble();
        System.out.println("Интервал равен: " + tc + " секунды");
        double d = sc * tc;
        System.out.println("Расстояния до места удара молнии: " + d + " фут");
        System.out.println("Или в метрах: " + d / f + " м");
    }

    public static void main(String[] args) {
        Task5 t = new Task5();
        t.distance();
    }
}
