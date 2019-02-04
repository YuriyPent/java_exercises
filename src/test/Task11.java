//Сделайте программу, которая будет проверять является ли число типа double целым
package test;

import java.util.Scanner;

public class Task11 {

    public static void isNumberC() {
        System.out.println("Введите число типа double");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        if (d == 0) {
            System.out.println("Это число ноль!");
        } else if (d % 2 == 0) {
            System.out.println("Это целое число!");
        } else {
            System.out.println("Это не целое число!");
        }
    }

    public static void main(String[] args) {
        isNumberC();
    }
}
