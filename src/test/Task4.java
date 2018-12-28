//Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
//Встретились Бяка и Бука - Никто не издал ни звука. 
package test;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Введите текст…");
        Scanner in = new Scanner(System.in, "Cp1251");
        String s = in.nextLine().replaceAll("Бяка", "*вырезано цензурой*");
        System.out.println(s);
    }
}
