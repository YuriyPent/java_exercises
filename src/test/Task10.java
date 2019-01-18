/*
 Найдите победителя марафона.
Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
(Опционально) Найдите человека, который прибежал вторым.
String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
"James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
 */
package test;

public class Task10 {

    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
            "James", "Jane", "Emilly", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        int b = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[b] > times[i]) {
                b = i;
            }
        }
        System.out.println("Быстрее всех пробежал " + names[b] + ", счёт - " + times[b]);
        int first = secondRunner(times, 2);
        System.out.println(names[first]);
    }

    public static int secondRunner(int[] array, int id) {
        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                num = array[i];
                id = i;
            }
        }
        System.out.println(num);
        return id;

    }
}
