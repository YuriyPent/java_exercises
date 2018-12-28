/*
 * Напишите программу, которая считывает символы пока 
не встретится точка. Также предусмотрите вывод количества пробелов.
 */
package test;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scan.nextLine();
        int i = text.indexOf(".");
        System.out.println("Символов до точки:" + i);
    }

}
