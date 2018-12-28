/*
Создайте простую игру основанную на угадывании букв.
Пользователь должен угадать загаданную букву A-Z введя ее в консоль. Если пользователь угадал букву 
программа выведет «Right» и игра закончится, если нет, то пользователь продолжит вводить буквы.
(Опционально) Вывести «You’re too low»- если пользователь ввел букву меньше загаданной, 
«You’re too high»- если пользователь ввел букву больше загаданной.
 */
package test;

import java.util.Random;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = (char) ('A' + new Random().nextInt(26));//любая буква из 26 начиная с А
        System.out.println(ch);
        System.out.println("Hello, try to guesse the letter!");
        for (char i = 0; i < 26; i++) {
            char s = sc.next().charAt(0);//присвоить переменной s символ из массива строки, начиная с первого элемента
            if (ch == s) {              //сравнить переменные  
                System.out.println("Right");
                break;//если равны, то выйти из цикла, написать Right
            } else {               
                if (Character.getNumericValue(ch) > Character.getNumericValue(s)) {//если значение заданного символа больше,
                    System.out.println("You are too low!");//чем значение введенного, то сообщение You are too low
                } else if (Character.getNumericValue(ch) < Character.getNumericValue(s)) {
                    System.out.println("You are too high!");//если наоборот, то You are too high
                }
            }
        }
    }
}
