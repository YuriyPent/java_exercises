/*
 Сила тяжести на Луне примерно равна 17%, 
напишите программу, которая вычисляет ваш вес на Луне.
 */
package test;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        double force = 0.17;
        System.out.println("Сила тяжести на Луне примерно равна 17%");
        System.out.println("Хотите узнать чему будет равен ваш вес?");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш вес ");
        double weight = scan.nextInt();
        System.out.println("Ваш вес на луне составит примерно: " + weight * force + " кг");
    }
    
}
