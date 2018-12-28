/*
Напишите метод, который будет увеличивать заданный элемент массива на 10%.
 */
package test;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        increase();
    }

    static int increase() throws ArrayIndexOutOfBoundsException {

        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Задан массив из: " + a.length + " элементов");
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите элемент массива: ");
        try {
            int element = scan.nextInt();
            System.out.print("Выбран элемент: " + element + ", котрорый равен " + a[element]);
            System.out.println("\nУвеличение массива на 10% \n");
            a[element] = (int) (a[element] * 1.1);
            System.out.println("Новое значение элемента массива: " + a[element]);         

        } catch (Exception e) {
            System.out.println("Ошибка!!!\nВведенное значение превышает заданное. Введите значение меньше");
        }
        return 0;
    }
}
