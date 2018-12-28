/*
Найдите среднее арифметическое массива из 10 элементов типа double.
 */
package test;

public class Task8 {
static double sum;
    public static void main(String[] args) {
      double a[] = {10,20,42,66,35,1,8,94,41,10};
        for (int i = 0; i < 10; i++) {
             sum += a[i];
        }System.out.println(sum/10);
    }

}
