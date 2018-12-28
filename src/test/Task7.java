//Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
//(Опционально) Дополните программу так, чтобы она вычисляла составные числа.
package test;

public class Task7 {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " - составное число\n");

            } else {
                System.out.print(i + " - простое число\n");
            }
        }
    }
}
